package com.reis.polimorfismo;

/**
 *
 * @author reis
 */
public abstract class Animal {

    private float peso;
    private int idade, membros;

    public Animal() {
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public abstract String locomover();

    public abstract String alimertar();

    public abstract String emitirSom();
}
