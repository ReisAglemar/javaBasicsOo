package com.reis.main;

/**
 *
 * @author reis
 */
public class Professor extends Pessoa{
    
    private String especialidade;
    private float salario;

    public Professor() {
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public float getSalario() {
        return salario;
    }
    
    public void receberAumento(float aumento){
        setSalario(getSalario() + aumento);
    }

    //@Override
    public String toStringProfessor() {
        return "Professor{" + "especialidade=" + especialidade + ", salario=" + salario + '}';
    }
}
