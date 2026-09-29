package com.example;

public class Contatore {
    private int valore;
    private int valoreMassimo;

    public Contatore(int valmax){
        this.valore = 0;
        this.valoreMassimo = valmax;
    }

    public Boolean incrementa(String nomeThread){
        if(this.valore < valoreMassimo){
            this.valore += 1;
            System.out.println(nomeThread + " ha incrementato il valore a " + this.valore);
            return true;
        } else{
            return false;
        }
    }
}
