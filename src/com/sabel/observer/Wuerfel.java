package com.sabel.observer;

import java.util.Random;

public class Wuerfel extends Subject{

    private int augenzahl;
    private final Random random;

    public Wuerfel() {
        random = new Random();
        wuerfeln();
    }

    public void wuerfeln() {
        augenzahl = random.nextInt(6) + 1;
        broadcast();
    }

    public int getAugenzahl() {
        return augenzahl;
    }


}

