package com.sabel.observer;

public class Main {

    public static void main(String[] args) {

        Wuerfel wuerfel = new Wuerfel();
        Beobachter b1 = new Zahlenausgabe(wuerfel);
        wuerfel.wuerfeln();
        Beobachter b2 = new Sternausgabe(wuerfel);
        wuerfel.wuerfeln();
        wuerfel.abmelden(b1);
        wuerfel.wuerfeln();


    }

}
