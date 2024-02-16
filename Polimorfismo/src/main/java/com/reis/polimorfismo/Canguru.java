package com.reis.polimorfismo;

/**
 *
 * @author reis
 */
public class Canguru extends Mamifero{

    public Canguru() {
    }
    
    public String usarBolsa(){
        return "Canguru usa sua bolsa";
    }
    
    @Override
    public String locomover(){
        return "Canguru salta";
    }
}
