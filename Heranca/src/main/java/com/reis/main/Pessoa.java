package com.reis.main;

/**
 *
 * @author reis
 */
public class Pessoa {
    
    private String nome, sexo;
    private int idade;

    public Pessoa() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }
    
    public void fazerAniversario(){
        
        setIdade(getIdade() + 1);
        System.out.println();
        System.out.println("    feliz aniversário " + getNome());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + '}';
    }
}
