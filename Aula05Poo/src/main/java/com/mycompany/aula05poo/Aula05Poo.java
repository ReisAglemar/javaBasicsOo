package com.mycompany.aula05poo;

import java.util.Scanner;

/**
 *
 * @author reis
 */
public class Aula05Poo {

    public static void main(String[] args) {

        ContaBanco mario = new ContaBanco(1, "Mario Bros");

        System.out.println("");
        System.out.println("");

        mario.controleObjeto();

        System.out.println("");
        System.out.println("");

        mario.abrirConta("cc");

        System.out.println("");

        mario.depositar(300.00f);

        System.out.println("");
        System.out.println("");

        mario.pagarMensal(mario.getTipo());

        System.out.println("");
        System.out.println("");

        mario.controleObjeto();

        System.out.println("");
        System.out.println("--------------FIM MARIO------------");
        System.out.println("");

        ContaBanco maria = new ContaBanco(2, "Maria Bras");

        maria.controleObjeto();

        System.out.println("");
        System.out.println("");

        maria.abrirConta("cp");

        System.out.println("");
        System.out.println("");
        
        maria.depositar(500.00f);

        System.out.println("");
        System.out.println("");
        
        maria.sacar(100.00f);

        System.out.println("");
        System.out.println("");
        
        maria.pagarMensal(maria.getTipo());

        System.out.println("");
        System.out.println("");

        maria.controleObjeto();

        System.out.println("");
        System.out.println("--------------FIM MARIA------------");
        System.out.println("");
    }
}
