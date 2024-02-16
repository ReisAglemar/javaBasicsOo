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
        
        mamifero.setPeso(10);
        reptil.setPeso(1);
        peixe.setPeso(0.9f);
        ave.setPeso(0.8f);
        
        mamifero.setIdade(2);
        reptil.setIdade(1);
        peixe.setIdade(3);
        ave.setIdade(1);
        
        mamifero.setMembros(4);
        reptil.setMembros(4);
        peixe.setMembros(0);
        ave.setMembros(2);
        
        mamifero.setCorDoPelo("Caramelo");
        reptil.setCorDaEscama("Verde");
        peixe.setCorDaEscama("Prateada");
        ave.setCorDaPena("Amarela");
        
        infoMamifero(mamifero);
        infoReptil(reptil);
        infopeixe(peixe);
        infoAve(ave);
    }
    
    public static void infoMamifero(Mamifero mamifero){
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
    
    public static void infoReptil(Reptil reptil){
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
    
    public static void infopeixe(Peixe peixe){
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
    
    public static void infoAve(Ave ave){
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
    
}
