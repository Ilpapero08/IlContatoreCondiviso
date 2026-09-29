package com.example;

public class Lavoratore implements Runnable{

    private Contatore contatore;
    private String nome_lavoratore;
    

    public Lavoratore(Contatore c, String nome){
        this.contatore = c;
        this.nome_lavoratore = nome;
    }

    @Override 
    public void run(){
        Boolean valido = true;
        while(valido){
            valido = contatore.incrementa(nome_lavoratore);
            try {
                Thread.sleep((int) (Math.random()*(500-100+1))+100);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        } 
    }
}
