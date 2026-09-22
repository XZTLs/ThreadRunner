package org.example;

import java.util.Random;

public class Corridore extends Thread {

    // Nome del corridore
    private String nome;

    // Generatore di numeri casuali
    private Random random = new Random();

    // Costruttore
    public Corridore(String nome) {
        this.nome = nome;
    }

    // Metodo eseguito quando il thread viene avviato
    @Override
    public void run() {

        // La corsa consiste in 5 passi
        for (int passo = 1; passo <= 5; passo++) {

            System.out.println(nome + " ha fatto il passo " + passo);

            try {
                // Pausa casuale tra 200 e 800 millisecondi
                int pausa = 200 + random.nextInt(601);

                Thread.sleep(pausa);

            } catch (InterruptedException e) {
                System.out.println(nome + " è stato interrotto.");
                return;
            }
        }

        // Il corridore ha completato tutti i passi
        System.out.println(nome + " è arrivato al traguardo!");
    }
}