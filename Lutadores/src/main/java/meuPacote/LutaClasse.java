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
            System.out.println("");
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
    public void lutar(int rounds) {

        setRounds(rounds);
        if (isAprovada()) {

            Random numeroRandom = new Random();
            int empate = 0, vitoriaDesafiante = 0, vitoriaDesafiado = 0;

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

            System.out.println("    Comentarista 2: - Sem dúvidas bons números, mas o " + desafiado.getNome() + ",");
            System.out.println("não deixa a desejar em nada, seus feitos não é para qualquer pessoa");
            desafiado.status();

            System.out.println("    Narrador: - Certemante, " + desafiante.getNacionalidade() + " e " + desafiado.getNacionalidade());
            System.out.println("estão bem representados no combate de hoje.");
            System.out.println("");
            System.out.println("    Sem mais delongas, que inicie-se o combate!");
            System.out.println("");

            for (int i = 1; i <= getRounds(); i++) {
                
                System.out.println("");
                System.out.println(i + "º ROND");

                int ronda = numeroRandom.nextInt(3);

                switch (ronda) {
                    case 0:
                        System.out.println("    Narrador: - Que round difícil! "
                                + desafiante.getNome() + " e " + desafiado.getNome() + " terminaram empatados.");
                        empate++;
                        break;

                    case 1:
                        System.out.println("    Narrador: - Foi um round bem definido, "
                                + desafiante.getNome() + " leva a viória nesse round.");
                        vitoriaDesafiante++;
                        break;

                    case 2:
                        System.out.println("    Narrador: - Esse round foi travado, mas o "
                                + desafiado.getNome() + " leva a melhor nesse round.");
                        vitoriaDesafiado++;
                        break;
                    default:
                        System.out.println("Erro no no sorteio");
                }
            }

            System.out.println("");

            /* PARA TESTAR A LÓGICA. DEVE DESABILITAR O BLOCO FOR
            empate = 1;
            vitoriaDesafiado = 0;
            vitoriaDesafiante = 2;
             */
            if (empate == vitoriaDesafiado && vitoriaDesafiado == vitoriaDesafiante
                    || empate > vitoriaDesafiado && empate > vitoriaDesafiante) {

                System.out.println("    Narrador: - Terminamos esse combate em empate, "
                        + desafiante.getNome() + " e " + desafiado.getNome() + " monstraram o melhor de si.");
                System.out.println("");

                desafiado.empatarLuta();
                desafiante.empatarLuta();

                System.out.println("    Narrador: - Vejamos como ficou os numeros dos noosos lutadores.");

                desafiante.status();
                desafiado.status();

            } else if (vitoriaDesafiante > vitoriaDesafiado) {

                System.out.println("    Narrador: - Terminamos esse combate com a vitória do "
                        + desafiante.getNome() + ".");
                System.out.println("certamente mostrou o melhor de si.");
                System.out.println("");

                desafiante.ganharLuta();
                desafiado.perderLuta();

                System.out.println("    Narrador: - Vejamos como ficou os numeros dos noosos lutadores.");

                desafiante.status();
                desafiado.status();

            } else {

                System.out.println("    Narrador: - Terminamos esse combate com a vitória do "
                        + desafiado.getNome() + ".");
                System.out.println("Certamente mostrou o melhor de si.");
                System.out.println("");

                desafiado.ganharLuta();
                desafiante.perderLuta();

                System.out.println("    Narrador: - Vejamos como ficou os numeros dos noosos lutadores.");
                System.out.println("");

                desafiante.status();
                desafiado.status();
            }

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
