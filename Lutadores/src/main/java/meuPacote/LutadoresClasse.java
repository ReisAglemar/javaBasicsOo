package meuPacote;

/**
 *
 * @author reis
 */
public class LutadoresClasse implements LutadoresFazem {

    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;    

    public static final int LUTADOR_ABAIXO_PESO = 0;
    public static final float PESO_LEVE_MINIMO = 52.2f;
    public static final float PESO_LEVE_MAXIMO = 70.3f;
    public static final float PESO_MEDIO_MAXIMO = 90.0f;
    public static final float PESO_PESADO_MAXIMO = 120.0f;

    // construtor --------------------------------------------------------------
    public LutadoresClasse(String nome, String nacionalidade, int idade,
            float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;        
        setCategoria();
    }

    // setters -----------------------------------------------------------------
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public void setCategoria() {

        // baseado no peso definide automaticamente a categoria
        if (peso > PESO_LEVE_MINIMO && peso < PESO_LEVE_MAXIMO) {
            this.categoria = "Leve";
        } else if (peso > PESO_LEVE_MAXIMO && peso < PESO_MEDIO_MAXIMO) {
            this.categoria = "Médio";
        } else if (peso > PESO_MEDIO_MAXIMO) {
            this.categoria = "Pesado";
        } else {
            System.out.println("O lutador " + getNome() + " não tem o peso mínimo"
                    + " necessário para lutar!");
            System.out.println("");
            System.out.println("Peso mínimo necessário: " + PESO_LEVE_MINIMO + " Kg.");
            System.out.println("");
            System.out.println("Peso do " + getNome() + ", " + getPeso() + " Kg.");
            System.out.println("");
            System.out.println("        ATENÇÃO !!!");
            System.out.println("");
            System.out.println("O lutador " + getNome() + " será desclassificado!");
            categoria = "DESCLASSIFICADO!";
        }
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    // getters -----------------------------------------------------------------
    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    // métodos epeciais --------------------------------------------------------
    @Override
    public void apresentar() {
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------- APRESENTAÇÃO DO LUTADOR -------------------");
        System.out.println("");
        System.out.println("    Nome: " + getNome());
        System.out.println("    Nacionalidade: " + getNacionalidade());
        System.out.println("    Idade: " + getIdade() + " anos");
        System.out.println("    Peso: " + getPeso() + " Kg");
        System.out.println("    Categoria: " + getCategoria());
        //System.out.println("    Vitórias: " + getVitorias());
        //System.out.println("    Derrotas: " + getDerrotas());
        //System.out.println("    Empates: " + getEmpates());
        System.out.println("");
        System.out.println("---------------------- LUTADOR APRESENTADO --------------------");
        System.out.println("");
    }

    @Override
    public void status() {
        System.out.println("");
        System.out.println("");
        System.out.println("---------------------- STATUS DO LUTADOR ----------------------");
        System.out.println("");
        System.out.println("    Nome: " + getNome());
        //System.out.println("    Nacionalidade: " + getNacionalidade());
        //System.out.println("    Idade: " + getIdade() + " anos");
        //System.out.println("    Peso: " + getPeso() + " kg");
        //System.out.println("    Categoria: " + getCategoria());
        System.out.println("    Vitórias: " + getVitorias());
        System.out.println("    Derrotas: " + getDerrotas());
        System.out.println("    Empates: " + getEmpates());
        System.out.println("");
        System.out.println("--------------------- STATUS APRESENTADOS --------------------");
        System.out.println("");
    }

    @Override
    public void ganharLuta() {
    }

    @Override
    public void perderLuta() {
    }

    @Override
    public void empatarLuta() {
    }
}
