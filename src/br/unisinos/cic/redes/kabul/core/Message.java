package br.unisinos.cic.redes.kabul.core;

import java.io.Serializable;

public class Message implements Serializable {

    private MessageType packetType;
    private Object payload;

    public Message(MessageType packageType)
    {
        this.packetType = packageType;
    }

    public Message(MessageType packageType, Object payload)
    {
        this.packetType = packageType;
        this.payload = payload;
    }

    public MessageType getMessageType() {
        return packetType;
    }    

    public Object getPayload() {
        return payload;
    }
}
