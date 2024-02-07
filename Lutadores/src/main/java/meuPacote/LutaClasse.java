package meuPacote;
import java.util.Random;

/**
 *
 * @author reis
 */
public class LutaClasse implements LutaFaz {

    private LutadoresClasse desafiado, desafiante;
    private int rounds;
    private boolean aprovada;

    // construtor --------------------------------------------------------------
    public LutaClasse() {
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

        if (desafiado.getCategoria().equals(desafiante.getCategoria())
                && desafiado != desafiante) {
            setAprovada(true);
            setDesafiado(desafiado);
            setDesafiante(desafiante);
            System.out.println("   Luta marcada com sucesso!");

        } else {
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);

            System.out.println("");
            System.out.println("");
            System.out.println("    A luta não pode ser marcada, verifique as regras "
                    + "para marcação de lutas.");
            System.out.println("");
            System.out.println("---------------------- REGRAS PARA MARCAR LUTAS --------------------");
            System.out.println("");
            System.out.println("    1- Os lutadores devem ser da mesma categoria;");
            System.out.println("    2- Os lutadores devem ser diferentes.");
            System.out.println("");
            System.out.println("---------------- VERIFIQUE OS DADOS INFORMADOS ABAIXO --------------");

            desafiado.status();
            desafiante.status();
        }
    }

    @Override
    public void lutar() {

        if (isAprovada()) {
            
            System.out.println("");
            System.out.println("");
            System.out.println("-------------------- É HORA DO COMBATE DE TITÃS ------------------");
            System.out.println("");
            System.out.println("");
            System.out.println("    Narrador: - Boa noite senhoras e senhores no combate de hoje temos dois grandes");
            System.out.println("titãs. No lado esquerdo do ring, o desafiante desse confronto,");
            desafiante.apresentar();
            
            System.out.println("");
            System.out.println("    Narrador: - No lado direito do ring o nosso desafiado de hoje,");
            desafiado.apresentar();
            
            System.out.println("    Comentarista: - São dois lutadores marcantes, " + desafiante.getNome());
            System.out.println("tem números impressionantes em sua carreira, vejam só");
            desafiante.status();
            
            System.out.println("    Comentarista 2: - Sem dúvidas bons números, mas o " + desafiado.getNome() +","); 
            System.out.println("não deixa a desejar em nada, seus feitos não é para qualquer pessoa");
            desafiado.status();
            
            System.out.println("    Narrador: - Certemante, " +desafiante.getNacionalidade() + " e " +desafiado.getNacionalidade());
            System.out.println("estão bem representados no combate de hoje.");
            System.out.println("");
            System.out.println("    Sem mais delongas, que inicie-se o primerio round!");
            
            Random numeroRandom = new Random();
            int ronda = numeroRandom.nextInt(3);
            System.out.println(ronda);
            

        } else {
            System.out.println("");
            System.out.println("");
            System.out.println("    A luta não pode occorer pois não está aprovada.");
            System.out.println("    A aprovação é automatica desde que haja uma luta marcada.");
            System.out.println("    Marque uma luta e tente novamente.");
            System.out.println("");
            System.out.println("");
        }
    }
}
