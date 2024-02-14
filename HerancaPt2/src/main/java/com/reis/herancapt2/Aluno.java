package com.reis.herancapt2;

/**
 *
 * @author reis
 */
public class Aluno extends Pessoa{
    
    private int matricula;
    private String curso;
    
    public String pagarMensalidade(){
        return "\n    A mensalidade do aluno " + getNome() + "\ninscrito no curos "
                + getCurso() + " foi paga com sucesso.\n";
    }

    public Aluno() {
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
