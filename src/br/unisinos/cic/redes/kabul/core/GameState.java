package br.unisinos.cic.redes.kabul.core;

import java.io.Serializable;

public enum GameState implements Serializable {
    NextPlayerTurn,
    NextOpponentTurn,
    PlayerTurn,
    OpponentTurn,
    GameOver
}
