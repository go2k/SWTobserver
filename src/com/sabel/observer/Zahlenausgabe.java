package com.sabel.observer;

public class Zahlenausgabe implements Beobachter {

    private Wuerfel wuerfel;

    public Zahlenausgabe(Wuerfel wuerfel) {
        this.wuerfel = wuerfel;
        this.wuerfel.anmelden(this);
    }

    @Override
    public void update() {

        System.out.println("es wurde gewürfelt: " + wuerfel.getAugenzahl());
    }


}
