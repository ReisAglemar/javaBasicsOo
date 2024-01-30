/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.obejetoclasse;

/**
 *
 * @author reis
 */
public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status (){
        System.out.println("ESTADO DA CANETA:");
        System.out.println("O modelo é: " + this.modelo);
        System.out.println("A cor é: " + this.cor);
        System.out.println("A ponta é: " + this.ponta);
        System.out.println("Sua carga está: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("");
    }
    
    void rabiscar(){
        System.out.println("A caneta " + this.modelo + " na cor " + this.cor + " está rabiscando...");
        System.out.println("...");
        System.out.println("....");
        System.out.println("A caneta " + this.modelo + " rabiscou tanto que a tinta acabou.");
        System.out.println("Após o uso, a caneta " + this.modelo + " está em outro estado." );
        System.out.println("");
        this.carga = 0;
    }
    
    void tampar (){
        this.tampada = true;
        System.out.println("A caneta " + this.modelo + " foi tampada.");
        System.out.println("");
    }
    
    void destampar (){
        this.tampada = false;       
        System.out.println("A caneta " + this.modelo + " foi destampada.");
        System.out.println("");
    }
        
}
