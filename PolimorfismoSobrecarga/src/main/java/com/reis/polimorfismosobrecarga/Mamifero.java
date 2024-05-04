/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reis.polimorfismosobrecarga;

/**
 *
 * @author reis
 */
public class Mamifero extends Animal {
    
    protected String corPelo;

    @Override
    public void emitirsom() {
        System.out.println("Som De Mamífero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}
