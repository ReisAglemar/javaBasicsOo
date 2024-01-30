package com.mycompany.poovisibilidade;

public class ClasseVisibilidade {

    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    //construtor, todo vez que for cirado um objeto o construtor de fato criará
    // o objeto e aplicará os atibutos enviados por parâmetros

    public ClasseVisibilidade(String modelo, String cor, float ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }
   

    //SET
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }     
  

    //GET
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public float getPonta() {
        return ponta;
    }

    public int getCarga() {
        return carga;
    }

    public boolean isTampada() {
        return tampada;
    }
    
    
    

    //MÉTODOS
    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Está tampada? " + this.isTampada());
    }

    public void escrever() {
        System.out.println("A caneta " + this.modelo + " está escrevendo.");
    }

    public void rabiscar() {
        System.out.println("A caneta " + this.modelo + " está rabiscando.");
    }

    public void pintar() {
        System.out.println("A caneta " + this.modelo + " está pintando.");
    }

    public void tampar() {
        this.tampada = true;
        System.out.println("A caneta " + this.modelo + " foi tampada.");
    }

    public void destampar() {
        this.tampada = false;
        System.out.println("A caneta " + this.getModelo() + " foi destampada.");
    }
    
    
}
