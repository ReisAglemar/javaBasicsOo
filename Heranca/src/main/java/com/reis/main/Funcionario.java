package com.reis.main;

/**
 *
 * @author reis
 */
public class Funcionario extends Pessoa{
    
    private String setor;
    boolean trabalhando;

    public Funcionario() {
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }
    
    public void mudarSetor(String novoSetor){
        setSetor(novoSetor);
    }

    //@Override
    public String toStringFuncionario() {
        return "Funcionario{" + "setor=" + setor + ", trabalhando=" + trabalhando + '}';
    }
}
