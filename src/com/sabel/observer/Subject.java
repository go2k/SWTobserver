package com.sabel.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Beobachter> bListe;

    public Subject() {
        this.bListe = new ArrayList<>();
    }

    public void anmelden(Beobachter beobachter) {
        bListe.add(beobachter);
    }

    public void abmelden(Beobachter beobachter) {
        bListe.remove(beobachter);
    }

    public void broadcast() {
        for (Beobachter beobachter : bListe) {
            beobachter.update();
        }
    }

}
