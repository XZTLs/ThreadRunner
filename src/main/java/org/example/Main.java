package org.example;

public class Main {

    public static void main(String[] args) {

        // Creazione dei due corridori
        Corridore corridoreA = new Corridore("Corridore A");
        Corridore corridoreB = new Corridore("Corridore B");

        // Avvio dei due thread
        corridoreA.start();
        corridoreB.start();

        try {
            // Il main aspetta che finisca il Corridore A
            corridoreA.join();

            // Il main aspetta che finisca il Corridore B
            corridoreB.join();

        } catch (InterruptedException e) {
            System.out.println("Il thread principale è stato interrotto.");
        }

        // Stampato solo dopo che entrambi i corridori hanno terminato
        System.out.println("Gara terminata!");
    }
}