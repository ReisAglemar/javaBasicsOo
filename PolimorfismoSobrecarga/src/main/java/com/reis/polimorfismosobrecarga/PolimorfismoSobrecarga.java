/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.reis.polimorfismosobrecarga;

/**
 *
 * @author reis
 */
public class PolimorfismoSobrecarga {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        Lobo lobo = new Lobo();

        //sobreposição mesma assinatura, classe diferente
        lobo.emitirsom();
        cachorro.emitirsom();

        //sobrecarga mesma classe, assinatura diferente
        cachorro.reagir("ola");
        cachorro.reagir(5, 0);
        cachorro.reagir(19, 0);
        cachorro.reagir(10, 0);
        cachorro.reagir(true);
        cachorro.reagir(false);
        cachorro.reagir(4, 2.2f);

    }
}
