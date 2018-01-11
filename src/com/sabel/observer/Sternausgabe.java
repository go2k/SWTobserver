package com.sabel.observer;

public class Sternausgabe implements Beobachter {
    private Wuerfel wuerfel;

    public Sternausgabe(Wuerfel wuerfel) {
        this.wuerfel = wuerfel;
        this.wuerfel.anmelden(this);
    }

    @Override
    public void update() {
        System.out.println("Sterne: " + wuerfel.getAugenzahl());
    }
}

