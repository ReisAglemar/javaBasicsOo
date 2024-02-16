/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.reis.polimorfismo;

/**
 *
 * @author reis
 */
public class Polimorfismo {

    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        GoldFish goldFish = new GoldFish();
        Arara arara = new Arara();

        mamifero.setPeso(10);
        reptil.setPeso(1);
        peixe.setPeso(0.9f);
        ave.setPeso(0.8f);
        canguru.setPeso(60.8f);
        cachorro.setPeso(12);
        cobra.setPeso(0.5f);
        tartaruga.setPeso(120);
        goldFish.setPeso(0.100f);
        arara.setPeso(5);

        mamifero.setIdade(2);
        reptil.setIdade(1);
        peixe.setIdade(3);
        ave.setIdade(1);
        canguru.setIdade(4);
        cachorro.setIdade(5);
        cobra.setIdade(1);
        tartaruga.setIdade(50);
        goldFish.setIdade(1);
        arara.setIdade(2);

        mamifero.setMembros(4);
        reptil.setMembros(4);
        peixe.setMembros(0);
        ave.setMembros(2);
        canguru.setMembros(2);
        cachorro.setMembros(4);
        cobra.setMembros(0);
        tartaruga.setMembros(4);
        goldFish.setMembros(0);
        arara.setMembros(2);

        mamifero.setCorDoPelo("Caramelo");
        reptil.setCorDaEscama("Verde");
        peixe.setCorDaEscama("Prateada");
        ave.setCorDaPena("Amarela");
        canguru.setCorDoPelo("Caramelo");
        cachorro.setCorDoPelo("Preto");
        cobra.setCorDaEscama("Amarela");
        tartaruga.setCorDaEscama("Marron claro");
        goldFish.setCorDaEscama("Dourada");
        arara.setCorDaPena("Verde e amarelo");

        infoMamifero(mamifero);
        infoReptil(reptil);
        infopeixe(peixe);
        infoAve(ave);
        infoCanguru(canguru);
        infoCachorro(cachorro);
        infoCobra(cobra);
        infoTartaruga(tartaruga);
        infoGoldFish(goldFish);
        infoArara(arara);
    }

    public static void infoMamifero(Mamifero mamifero) {
        System.out.println("");
        System.out.println(mamifero.getPeso());
        System.out.println(mamifero.getIdade());
        System.out.println(mamifero.getMembros());
        System.out.println(mamifero.locomover());
        System.out.println(mamifero.alimertar());
        System.out.println(mamifero.emitirSom());
        System.out.println(mamifero.getCorDoPelo());
        System.out.println("");
    }

    public static void infoReptil(Reptil reptil) {
        System.out.println("");
        System.out.println(reptil.getPeso());
        System.out.println(reptil.getIdade());
        System.out.println(reptil.getMembros());
        System.out.println(reptil.locomover());
        System.out.println(reptil.alimertar());
        System.out.println(reptil.emitirSom());
        System.out.println(reptil.getCorDaEscama());
        System.out.println("");
    }

    public static void infopeixe(Peixe peixe) {
        System.out.println("");
        System.out.println(peixe.getPeso());
        System.out.println(peixe.getIdade());
        System.out.println(peixe.getMembros());
        System.out.println(peixe.locomover());
        System.out.println(peixe.alimertar());
        System.out.println(peixe.emitirSom());
        System.out.println(peixe.getCorDaEscama());
        System.out.println(peixe.soltarBolhas());
        System.out.println("");
    }

    public static void infoAve(Ave ave) {
        System.out.println("");
        System.out.println(ave.getPeso());
        System.out.println(ave.getIdade());
        System.out.println(ave.getMembros());
        System.out.println(ave.locomover());
        System.out.println(ave.alimertar());
        System.out.println(ave.emitirSom());
        System.out.println(ave.getCorDaPena());
        System.out.println(ave.fazerNinho());
        System.out.println("");
    }

    public static void infoCanguru(Canguru canguru) {
        System.out.println("");
        System.out.println(canguru.getPeso());
        System.out.println(canguru.getIdade());
        System.out.println(canguru.getMembros());
        System.out.println(canguru.locomover());
        System.out.println(canguru.alimertar());
        System.out.println(canguru.emitirSom());
        System.out.println(canguru.getCorDoPelo());
        System.out.println(canguru.usarBolsa());
        System.out.println("");
    }

    public static void infoCachorro(Cachorro cachorro) {
        System.out.println("");
        System.out.println(cachorro.getPeso());
        System.out.println(cachorro.getIdade());
        System.out.println(cachorro.getMembros());
        System.out.println(cachorro.locomover());
        System.out.println(cachorro.alimertar());
        System.out.println(cachorro.emitirSom());
        System.out.println(cachorro.getCorDoPelo());
        System.out.println(cachorro.enterrarOsso());
        System.out.println(cachorro.abanarRabo());
        System.out.println("");
    }

    public static void infoCobra(Cobra cobra) {
        System.out.println("");
        System.out.println(cobra.getPeso());
        System.out.println(cobra.getIdade());
        System.out.println(cobra.getMembros());
        System.out.println(cobra.locomover());
        System.out.println(cobra.alimertar());
        System.out.println(cobra.emitirSom());
        System.out.println(cobra.getCorDaEscama());
        System.out.println("");
    }

    public static void infoTartaruga(Tartaruga tartaruga) {
        System.out.println("");
        System.out.println(tartaruga.getPeso());
        System.out.println(tartaruga.getIdade());
        System.out.println(tartaruga.getMembros());
        System.out.println(tartaruga.locomover());
        System.out.println(tartaruga.alimertar());
        System.out.println(tartaruga.emitirSom());
        System.out.println(tartaruga.getCorDaEscama());
        System.out.println("");
    }

    public static void infoGoldFish(GoldFish goldFish) {
        System.out.println("");
        System.out.println(goldFish.getPeso());
        System.out.println(goldFish.getIdade());
        System.out.println(goldFish.getMembros());
        System.out.println(goldFish.locomover());
        System.out.println(goldFish.alimertar());
        System.out.println(goldFish.emitirSom());
        System.out.println(goldFish.getCorDaEscama());
        System.out.println(goldFish.soltarBolhas());
        System.out.println("");
    }

    public static void infoArara(Arara arara) {
        System.out.println("");
        System.out.println(arara.getPeso());
        System.out.println(arara.getIdade());
        System.out.println(arara.getMembros());
        System.out.println(arara.locomover());
        System.out.println(arara.alimertar());
        System.out.println(arara.emitirSom());
        System.out.println(arara.getCorDaPena());
        System.out.println(arara.fazerNinho());
        System.out.println("");
    }
}
