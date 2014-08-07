package br.unisinos.cic.redes.kabul.server;

import br.unisinos.cic.redes.kabul.core.Attribute;
import br.unisinos.cic.redes.kabul.core.Card;
import br.unisinos.cic.redes.kabul.core.GameResult;
import br.unisinos.cic.redes.kabul.core.GameState;
import br.unisinos.cic.redes.kabul.core.Message;
import br.unisinos.cic.redes.kabul.core.Result;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Server {

    private LinkedList<Card> playerDeck;
    private LinkedList<Card> opponentDeck;
    private Card currentPlayerCard;
    private Card currentOpponentCard;
    private GameState gameState;
    private Attribute opponentAttribute;

    public void run(int port) throws IOException, ClassNotFoundException {
        ServerSocket server = new ServerSocket(port);

        boolean running = true;

        while (running) {
            Socket socket = server.accept();

            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());

            boolean connected = true;

            while (connected) {
                Message message = null;

                try {
                    message = (Message) input.readObject();
                } catch (EOFException ex) {
                    break;
                } catch (SocketException ex) {
                    break;
                }

                switch (message.getMessageType()) {
                    case NewGame:
                        newGame();
                        break;
                    case PlayerCard:
                        output.writeObject(getNextPlayerCard());
                        break;
                    case OpponentCard:
                        output.writeObject(getNextOpponentCard());
                        break;
                    case PlayerDeckSize:
                        output.writeInt(playerDeck.size());
                        break;
                    case OpponentDeckSize:
                        output.writeInt(opponentDeck.size());
                        break;
                    case PlayerTurn:
                        output.writeObject(playerTurn((Attribute) message.getPayload()));
                        break;
                    case OpponentTurn:
                        output.writeObject(opponentTurn());
                        break;
                    case OpponentAttribute:
                        output.writeObject(nextOpponentAttribute());
                        break;
                    case GameState:
                        output.writeObject(gameState);
                        break;
                    case PlayerReady:
                        playerReady();
                        break;
                    case GameResult:
                        output.writeObject(opponentDeck.isEmpty() ? GameResult.Winner : GameResult.Loser);
                        break;
                    case End:
                        connected = false;
                        break;
                }

                output.flush();
            }

            socket.close();
        }
    }

    private Result playerTurn(Attribute attribute) {
        return turn(attribute);
    }

    private Result opponentTurn() {
        Attribute attribute = opponentAttribute;
        return turn(attribute);
    }

    private Attribute nextOpponentAttribute() {
        int random = (int) Math.round(Math.random() * 4);

        switch (random) {
            case 1:
                opponentAttribute = Attribute.Velocidade;
                break;
            case 2:
                opponentAttribute = Attribute.CC;
                break;
            case 3:
                opponentAttribute = Attribute.Peso;
                break;
            default:
                opponentAttribute = Attribute.Potencia;
        }

        return opponentAttribute;
    }

    private Result turn(Attribute attribute) {
        Result result = Result.Empate;

        switch (attribute) {
            case Velocidade:
                boolean vitoria = currentPlayerCard.getSpeed() > currentOpponentCard.getSpeed();
                boolean empate = currentPlayerCard.getSpeed() == currentOpponentCard.getSpeed();
                result = vitoria ? Result.Vitoria : empate ? Result.Empate : Result.Derrota;
                break;
            case Potencia:
                vitoria = currentPlayerCard.getPower() > currentOpponentCard.getPower();
                empate = currentPlayerCard.getPower() == currentOpponentCard.getPower();
                result = vitoria ? Result.Vitoria : empate ? Result.Empate : Result.Derrota;
                break;
            case CC:
                vitoria = currentPlayerCard.getCc() > currentOpponentCard.getCc();
                empate = currentPlayerCard.getCc() == currentOpponentCard.getCc();
                result = vitoria ? Result.Vitoria : empate ? Result.Empate : Result.Derrota;
                break;
            case Peso:
                vitoria = currentPlayerCard.getWeight() > currentOpponentCard.getWeight();
                empate = currentPlayerCard.getWeight() == currentOpponentCard.getWeight();
                result = vitoria ? Result.Vitoria : empate ? Result.Empate : Result.Derrota;
                break;
        }

        switch (result) {
            case Vitoria:
                opponentDeck.remove(currentOpponentCard);
                playerDeck.add(currentOpponentCard);
                playerDeck.add(playerDeck.removeFirst());
                gameState = GameState.NextPlayerTurn;
                break;
            case Derrota:
                playerDeck.remove(currentPlayerCard);
                opponentDeck.add(currentPlayerCard);
                opponentDeck.add(opponentDeck.removeFirst());
                gameState = GameState.NextOpponentTurn;
                break;
            case Empate:
                playerDeck.add(playerDeck.removeFirst());
                opponentDeck.add(opponentDeck.removeFirst());
                if (gameState == GameState.PlayerTurn) {
                    gameState = GameState.NextPlayerTurn;
                } else {
                    gameState = GameState.NextOpponentTurn;
                }
                break;
        }

        if (playerDeck.isEmpty() || opponentDeck.isEmpty()) {
            gameState = GameState.GameOver;
        }

        return result;
    }

    private Card getNextOpponentCard() {
        currentOpponentCard = opponentDeck.getFirst();
        return currentOpponentCard;
    }

    private Card getNextPlayerCard() {
        currentPlayerCard = playerDeck.getFirst();
        return currentPlayerCard;
    }

    private void playerReady() {
        switch (gameState) {
            case NextPlayerTurn:
                gameState = GameState.PlayerTurn;
                break;
            case NextOpponentTurn:
                gameState = GameState.OpponentTurn;
                break;
        }
    }

    private void newGame() {
        playerDeck = new LinkedList<Card>();
        opponentDeck = new LinkedList<Card>();

        LinkedList<Card> deck = loadDeck();

        for (int i = 0; i < deck.size(); i++) {
            if (i % 2 == 0) {
                playerDeck.add(deck.get(i));
            } else {
                opponentDeck.add(deck.get(i));
            }
        }

        currentPlayerCard = null;
        currentOpponentCard = null;

        gameState = GameState.PlayerTurn;
    }

    private LinkedList<Card> loadDeck() {
        LinkedList<Card> deck = new LinkedList<Card>();

        deck.add(new Card("Ferrari F355 GTS", 280, 295, 0, 3496, Server.class.getResource("images/ferrari1.jpg")));
        deck.add(new Card("Mercedes-Benz 300 SL", 158, 225, 0, 2996, Server.class.getResource("images/mercedes1.jpg")));
        deck.add(new Card("Shelby Mustang GT500", 410, 249, 0, 5408, Server.class.getResource("images/mustang1.jpg")));
        deck.add(new Card("Dodge Charger", 280, 257, 1665, 3680, Server.class.getResource("images/dodge1.jpg")));
        deck.add(new Card("Chevrolet Corvette 1970", 276, 232, 1490, 7500, Server.class.getResource("images/corvette1.jpg")));
        deck.add(new Card("Ford GT40 2003", 316, 330, 1520, 5049, Server.class.getResource("images/Ford_GT40_1.jpg")));
        deck.add(new Card("Lotus Esprit 1979", 157, 240, 1300, 1973, Server.class.getResource("images/lotus1.jpg")));
        deck.add(new Card("Jaguar E Type V12 1977", 227, 220, 1525, 5344, Server.class.getResource("images/lotus1.jpg")));
        //deck.add(new Card("Chevrolet Impala", 275, 175, 0, 6490, Server.class.getResource("images/impala1.jpg")));

        Collections.sort(deck);

        return deck;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.print("Informe a porta a ser utilizada pelo servidor: ");
        Scanner in = new Scanner(System.in);
        int i = -1;
        do {
            if (in.hasNextInt()) {
                i = in.nextInt();
            } else {
                in.next();
                System.out.print("Valor inválido, a porta deve ser um número e estar entre 0 e 65535, por favor, informe novamente: ");
            }
        } while (i < 0 || i > 65535);
        System.out.println("Iniciando servidor...");
        new Server().run(i);
    }
}
