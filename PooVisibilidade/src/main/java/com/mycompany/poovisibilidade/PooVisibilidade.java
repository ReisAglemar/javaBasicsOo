package com.mycompany.poovisibilidade;

public class PooVisibilidade {

    public static void main(String[] args) {

        /*
        VIA DE REGRA() {
        atributos são privados (private);
        métodos são públicos (public);
        }
         */
        // instânciando o objeto caneta preta, enviado por parâmetros seus atributos
        ClasseVisibilidade canetaPreta = new ClasseVisibilidade(
                "Bic cristal",
                "Preta",
                0.5f,
                90,
                false);

        // instânciando o objeto caneta Azul, enviado por parâmetros seus atributos
        ClasseVisibilidade canetaAzul = new ClasseVisibilidade(
                "Bic Pro",
                "Azul",
                0.9f,
                85,
                true);

        canetaPreta.status();
        System.out.println("");
        System.out.println("");
        canetaAzul.status();
        System.out.println("");
        System.out.println("");
    }
}
