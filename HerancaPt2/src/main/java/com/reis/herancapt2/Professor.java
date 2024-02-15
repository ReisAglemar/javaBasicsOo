package com.reis.herancapt2;

/**
 *
 * @author reis
 */
public final class Professor extends Pessoa{
    
    private String especialidade;
    private float salario;
    
    
    public String receberAumento(float aumento){
        
        setSalario(getSalario() + aumento);
    
        return "    Aumento no valor de " + aumento + " foi concedido.\n" 
                + "novo salário do professor " + getNome() + " é de R$: " + getSalario() ;    
    }

    public Professor() {
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
