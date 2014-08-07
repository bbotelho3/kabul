package br.unisinos.cic.redes.kabul.core;

import java.io.Serializable;
import java.net.URL;

public class Card implements Serializable, Comparable {

    private String name;
    private int power;
    private int speed;
    private double weight;
    private int cc;
    private URL imageUrl;
    private double index;

    public Card(String name, int power, int speed, double weight, int cc, URL imageUrl) {
        this.name = name;
        this.power = power;
        this.speed = speed;
        this.weight = weight;
        this.imageUrl = imageUrl;
        this.cc = cc;
        this.index = Math.random();
    }

    public int getCc() {
        return cc;
    }

    public URL getImageUrl() {
        return imageUrl;
    }

    public double getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public int compareTo(Object card) {
        return new Double(getIndex()).compareTo(((Card)card).getIndex());
    }
}
