package com.reis.main;

/**
 *
 * @author reis
 */
public class Aluno extends Pessoa{
    
    private int matricula;
    private String curso;

    public Aluno() {
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }
    
    public void cancelarMatricula(){
        
        setMatricula(0);
        System.out.println();
        System.out.println("    Matrícula cancelada com sucesso.");
        System.out.println();
    }

    //@Override
    public String toStringAluno() {
        return "Aluno{" + "matricula=" + matricula + ", curso=" + curso + '}';
    }
}
