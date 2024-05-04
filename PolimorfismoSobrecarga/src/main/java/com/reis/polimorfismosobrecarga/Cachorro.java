/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reis.polimorfismosobrecarga;

/**
 *
 * @author reis
 */
public class Cachorro extends Lobo {

    @Override
    public void emitirsom() {
        System.out.println("Au! Au! Au!");
    }

    public void reagir(String frase) {
        if (frase.equals("ola")) {
            System.out.println("Cachorro feliz");
        } else {
            System.out.println("Cacchorro brabo");
        }
    }

    public void reagir(int hora, int minuto) {
        if (hora < 6) {
            System.out.println("hora é menor que seis, cachorro não reage. hora: " + hora);
        } else if (hora > 18) {
            System.out.println("hora é maior que dezoito, cachorro não reage. hora: " + hora);
        } else {
            System.out.println("a hora está entre seis e dezoito, cachorro feliz. hora: " + hora);
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Cachorro reage ao seu dono");
        } else {
            System.out.println("Cachorro não reage à estranhos");
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5 && peso < 5.5) {
            System.out.println("Cachorro NOVO e LEVE. Idade: " + idade + ". Peso: " + peso + ".");
        } else if (idade > 10 && peso > 10.5) {
            System.out.println("Cachorro IDOSO e PESADO. Idade: " + idade + ". Peso: " + peso + ".");
        } else {
            System.out.println("Cachorro está na média de idade e peso. Idade: " + idade + ". Peso: " + peso + ".");
        }
    }
    
    public void reagir(float peso, int idade) {
        if (idade < 5 && peso < 5.5) {
            System.out.println("Cachorro NOVO e LEVE. Idade: " + idade + ". Peso: " + peso + ".");
        } else if (idade > 10 && peso > 10.5) {
            System.out.println("Cachorro IDOSO e PESADO. Idade: " + idade + ". Peso: " + peso + ".");
        } else {
            System.out.println("Cachorro está na média de idade e peso. Idade: " + idade + ". Peso: " + peso + ".");
        }
    }
}
