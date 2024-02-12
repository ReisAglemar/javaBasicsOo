package com.reis.exercicios;

/**
 *
 * @author reis
 */
public class Pessoa {

    private String nome;
    private int idade, id;
    private char sexo;

    public Pessoa(String nome, int id, int idade, char sexo) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getId() {
        return id;
    }

    public char getSexo() {
        return sexo;
    }

    public void fazerAniversario() {

        setIdade(getIdade() + 1);
        System.out.println("");
        System.out.println("    FELIZ ANIVERSÁRIO!!!");
        System.out.println("    " + getNome() + ", parabéns pelos seus " + getIdade() + " anos.");
        System.out.println("");
    }

    public void informacao() {

        System.out.println("");
        System.out.println("========== INFORMAÇÕES SOBRE O USUÁRIO ===========");
        System.out.println("");
        System.out.println("    Nome do usuário: " + getNome());
        System.out.println("    Idade do usuário: " + getIdade());
        System.out.println("    ID do usuário: " + getId());
        System.out.println("    Sexo do usuário: " + getSexo());
        System.out.println("");
        System.out.println("------------------------------------------------");
    }
}
