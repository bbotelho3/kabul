package br.unisinos.cic.redes.kabul.client;

import br.unisinos.cic.redes.kabul.core.Attribute;
import br.unisinos.cic.redes.kabul.core.Card;
import br.unisinos.cic.redes.kabul.core.GameResult;
import br.unisinos.cic.redes.kabul.core.GameState;
import br.unisinos.cic.redes.kabul.core.Message;
import br.unisinos.cic.redes.kabul.core.MessageType;
import br.unisinos.cic.redes.kabul.core.Result;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class GameClient {

    private Socket socket;
    private ObjectOutputStream output;
    private ObjectInputStream input;

    public boolean connect(String ip, int port) {
        try {
            socket = new Socket(ip, port);
            output = new ObjectOutputStream(socket.getOutputStream());
            input = new ObjectInputStream(socket.getInputStream());
        } catch (UnknownHostException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }
        return true;
    }

    public void newGame() throws IOException {
        output.writeObject(new Message(MessageType.NewGame));
        output.flush();
    }

    public int getPlayerDeckSize() throws IOException {
        output.writeObject(new Message(MessageType.PlayerDeckSize));
        output.flush();
        return input.readInt();
    }

    public int getOpponentDeckSize() throws IOException {
        output.writeObject(new Message(MessageType.OpponentDeckSize));
        output.flush();
        return input.readInt();
    }

    public GameState getGameState() throws IOException, ClassNotFoundException {
        output.writeObject(new Message(MessageType.GameState));
        output.flush();
        return (GameState) input.readObject();
    }

    public Result playerTurn(Attribute attribute) throws IOException, ClassNotFoundException {
        output.writeObject(new Message(MessageType.PlayerTurn, attribute));
        output.flush();
        return (Result) input.readObject();
    }

    public Result opponentTurn() throws IOException, ClassNotFoundException {
        output.writeObject(new Message(MessageType.OpponentTurn));
        output.flush();
        return (Result) input.readObject();
    }

    public Card getNextOpponentCard() throws IOException, ClassNotFoundException {
        output.writeObject(new Message(MessageType.OpponentCard));
        output.flush();
        return (Card) input.readObject();
    }

    public Card getNextPlayerCard() throws IOException, ClassNotFoundException {
        output.writeObject(new Message(MessageType.PlayerCard));
        output.flush();
        return (Card) input.readObject();
    }

    public void playerReady() throws IOException {
        output.writeObject(new Message(MessageType.PlayerReady));
        output.flush();
    }

    public Attribute getOpponentAttribute() throws IOException, ClassNotFoundException {
        output.writeObject(new Message(MessageType.OpponentAttribute));
        output.flush();
        return (Attribute) input.readObject();
    }

    public GameResult getGameResult() throws IOException, ClassNotFoundException {
        output.writeObject(new Message(MessageType.GameResult));
        output.flush();
        return (GameResult) input.readObject();
    }
}
