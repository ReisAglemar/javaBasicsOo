package meuPacote;

/**
 *
 * @author reis
 */
public class LutaClasse implements LutaFaz{

    private LutadoresClasse desafiado, desafiante;
    private int rounds;
    private boolean aprovada;

    // construtor --------------------------------------------------------------
    public LutaClasse(LutadoresClasse desafiado, LutadoresClasse desafiante) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
    }

    // setters -----------------------------------------------------------------
    public void setDesafiado(LutadoresClasse desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(LutadoresClasse desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    // getters -----------------------------------------------------------------
    public LutadoresClasse getDesafiado() {
        return desafiado;
    }

    public LutadoresClasse getDesafiante() {
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
    public void marcarLuta(LutadoresClasse desafiado, LutadoresClasse desafiante) {
         if (desafiado.getCategoria().equals(desafiante.getCategoria())) {
            System.out.println("são iguais");
        } else {
             System.out.println("são diferentes");
        }
    }

    @Override
    public void lutar(LutadoresClasse desafiado, LutaClasse dasafiante) {
    }
}
