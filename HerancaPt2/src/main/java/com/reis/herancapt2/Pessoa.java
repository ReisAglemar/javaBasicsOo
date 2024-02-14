package com.reis.herancapt2;

/**
 *
 * @author reis
 */
public abstract class Pessoa {

    private String nome, sexo;
    private int idade;

    public final String fazerAniversario() {
        setIdade(getIdade()+1);        
        return "Parabéns " + nome + ", pelos seus " + idade + " anos de vida.";
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
