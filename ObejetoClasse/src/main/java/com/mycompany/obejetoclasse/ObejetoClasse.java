/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.obejetoclasse;

/**
 *
 * @author reis
 */
public class ObejetoClasse {

    public static void main(String[] args) {

        Caneta canetaPreta = new Caneta();
        Caneta canetaAzul = new Caneta();

        canetaPreta.carga = 1;
        canetaPreta.cor = "Preta";
        canetaPreta.modelo = "Big cristal";
        canetaPreta.ponta = 0.9f;
        canetaPreta.tampada = true;

        canetaPreta.status();
        canetaPreta.destampar();
        canetaPreta.rabiscar();
        canetaPreta.tampar();
        canetaPreta.status();

        canetaAzul.carga = 1;
        canetaAzul.cor = "Azul";
        canetaAzul.modelo = "Big linha pro";
        canetaAzul.ponta = 0.5f;
        canetaAzul.tampada = true;

        canetaAzul.status();
        canetaAzul.destampar();
        canetaAzul.rabiscar();
        canetaAzul.tampar();
        canetaAzul.status();

    }
}
