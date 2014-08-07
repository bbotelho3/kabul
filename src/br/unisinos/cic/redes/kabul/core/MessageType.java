package br.unisinos.cic.redes.kabul.core;

import java.io.Serializable;

public enum MessageType implements Serializable
{
    NewGame,
    PlayerCard,
    OpponentCard,
    PlayerDeckSize,
    OpponentDeckSize,
    PlayerTurn,
    OpponentTurn,
    GameState,
    PlayerReady,
    OpponentAttribute,
    GameResult,
    End
}