package com.reis.herancapt2;

/**
 *
 * @author reis
 */
public final class Tecnico extends Aluno {

    private int registroProfissional;

    public String praticar(String funcao) {

        return "    O aluno técnico " + getNome() + " do curso " + getCurso() + ",\n"
                + "está praticando a função de " + funcao + ".";
    }
    
    @Override
    public String pagarMensalidade(){
        return "\n    A mensalidade do aluno técnico " + getNome() + "\ninscrito no curos "
                + getCurso() + " foi paga com sucesso.\n";
                
    }

    public Tecnico() {
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

}
