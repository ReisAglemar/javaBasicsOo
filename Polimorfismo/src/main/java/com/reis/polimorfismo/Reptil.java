package com.reis.polimorfismo;

/**
 *
 * @author reis
 */
public class Reptil extends Animal {

    private String corDaEscama;

    public Reptil() {
    }

    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }

    @Override
    public String locomover() {
        return "Reptil rasteja";
    }

    @Override
    public String alimertar() {
        return "Reptil como vegetais";
    }

    @Override
    public String emitirSom() {
        return "Reptil faz som de reptil";
    }
}
