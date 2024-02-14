package com.reis.herancapt2;

/**
 *
 * @author reis
 */
public class Bolsista extends Aluno{
    
    private int bolsa;
        
    
    public String renovarBolsa(){
        return "\n    A bolsa do(a) aluno(a) " + getNome() + " foi renovada.\n";
    }
    
    @Override
    public String pagarMensalidade(){
        return "\n    A mensalidade do aluno bolsista " + getNome() + "\ninscrito no curos "
                + getCurso() + " foi paga com sucesso.\n";
    }

    public Bolsista() {
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
