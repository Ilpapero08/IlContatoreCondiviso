package com.example;

public class Main {
    public static void main(String[] args) {
        Contatore c = new Contatore(10);

        Lavoratore l1 = new Lavoratore(c, "Mario");
        Lavoratore l2 = new Lavoratore(c, "Alberto");

        Thread t1 = new Thread(l1);
        Thread t2 = new Thread(l2);

        t1.start();
        t2.start();
       
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.getMessage();
        }
        System.out.println("Raggiunto valore massimo del contatore!!!");
    }
}