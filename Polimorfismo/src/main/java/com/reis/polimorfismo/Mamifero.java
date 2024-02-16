package com.reis.polimorfismo;

/**
 *
 * @author reis
 */
public class Mamifero extends Animal {

    private String corDoPelo;

    public Mamifero() {
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    @Override
    public String locomover() {
        return "Mamífero corre";
    }

    @Override
    public String alimertar() {
        return "Mamífero mama";
    }

    @Override
    public String emitirSom() {
        return "Mamífero faz som de mamífero";
    }
}
