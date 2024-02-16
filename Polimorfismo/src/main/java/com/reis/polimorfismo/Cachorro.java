package com.reis.polimorfismo;

/**
 *
 * @author reis
 */
public class Cachorro extends Mamifero{

    public Cachorro() {
    }
    
    public String enterrarOsso(){
        return "Cachorro enterra o osso";
    }
    
    public String abanarRabo(){
        return "Cachorro abana o rabo";
    }
    
   
    @Override
    public String emitirSom(){
        return "Cachorro late";
    }
}
