package com.reis.polimorfismo;

/**
 *
 * @author reis
 */
public class Peixe extends Animal {

    private String corDaEscama;

    public Peixe() {
    }

    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }
    
    public String soltarBolhas(){
        return "Soltou bolhas";
    }

    @Override
    public String locomover() {
        return "Peixe nada";
    }

    @Override
    public String alimertar() {
        return "Peixe come";
    }

    @Override
    public String emitirSom() {
        return "Peixe não faz som";
    }
}
