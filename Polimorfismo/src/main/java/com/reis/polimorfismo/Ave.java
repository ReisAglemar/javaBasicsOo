package com.reis.polimorfismo;

/**
 *
 * @author reis
 */
public class Ave extends Animal{
    
    private String corDaPena;

    public Ave() {
    }

    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }
    
    public String fazerNinho(){
        return "Ave fez um ninho";
    }

    @Override
    public String locomover() {
        return "Ave voa";
    }

    @Override
    public String alimertar() {
        return "Ave come";
    }

    @Override
    public String emitirSom() {
        return "Ave faz som de ave";
    }
}
