
package meuPacote;

/**
 *
 * @author reis
 */
public class LutaClasse implements LutaFaz{
    private String desafiado, desafiante;
    private int rounds;
    private boolean aprovada;

    // construtor --------------------------------------------------------------
    public LutaClasse(){
    }
    
    // setters -----------------------------------------------------------------
    public void setDesafiado(String desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(String desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    // getters -----------------------------------------------------------------
    public String getDesafiado() {
        return desafiado;
    }

    public String getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }
    
    // Métodos especiasi -------------------------------------------------------
    @Override
    public void marcarLuta() {
    }

    @Override
    public void lutar() {
    }
}
