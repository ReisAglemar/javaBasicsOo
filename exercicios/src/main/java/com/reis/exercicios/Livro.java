package com.reis.exercicios;

/**
 *
 * @author reis
 */
public class Livro implements Publicacao {

    private String titulo, autor;
    private int totalPaginas, paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.leitor = leitor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public String getLeitor() {
        return leitor.getNome();
    }

    public void detalhes() {

        System.out.println("");
        System.out.println("========== INFORMAÇÕES SOBRE O LIVRO ===========");
        System.out.println("");
        System.out.println("    Título do Livro: " + getTitulo());
        System.out.println("    Autor do livro: " + getAutor());
        System.out.println("    Total de páginas: " + getTotalPaginas());
        System.out.println("    Página atual: " + getPaginaAtual());
        System.out.println("    Livro aberto? " + isAberto());
        System.out.println("    Seu leitor atual é: " + getLeitor());
        System.out.println("");
        System.out.println("------------------------------------------------");
    }

    @Override
    public void abrir() {

        if (!isAberto()) {
            setAberto(true);
            System.out.println("");
            System.out.println("O livro, " + getTitulo() + " foi aberto!");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("Você está tentando abrir um livro aberto!");
            System.out.println("");
        }
    }

    @Override
    public void fechar() {

        if (isAberto()) {
            setAberto(false);
            System.out.println("");
            System.out.println("O livro, " + getTitulo() + " foi fechado!");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("Você está tentando fechar um livro fechado!");
            System.out.println("");
        }
    }

    @Override
    public void folhar() {

        if (isAberto()) {
            for (int i = 0; i <= getTotalPaginas(); i++) {
                System.out.println("Pág: " + i);
            }
            System.out.println("");
            System.out.println("    LIVRO FOLHADO POR COMPLETO!");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("Você deve primeiro abir o livro!");
            System.out.println("");
        }

    }

    @Override
    public void avançarPagina() {

        if (isAberto() && getPaginaAtual() < getTotalPaginas()) {
            System.out.println("");
            System.out.println("    Página atual: " + getPaginaAtual());
            System.out.println("    Avançou uma pagina!");
            setPaginaAtual(getPaginaAtual() + 1);
            System.out.println("    Agora a página atual é: " + getPaginaAtual());
            System.out.println("");
        } else if (!isAberto()) {
            System.out.println("");
            System.out.println("Você deve primeiro abir o livro!");
            System.out.println("");
        } else {
            System.out.println("Não é possível avançar mais páginas, você "
                    + "já esta na última página");
            System.out.println("    Página atual: " + getPaginaAtual());
        }
    }

    @Override
    public void voltarPagina() {

        if (isAberto() && getPaginaAtual() > 0) {
            System.out.println("");
            System.out.println("    Página atual: " + getPaginaAtual());
            System.out.println("    Retornou uma pagina!");
            setPaginaAtual(getPaginaAtual() - 1);
            System.out.println("    Agora a página atual é: " + getPaginaAtual());
            System.out.println("");
        } else if (!isAberto()) {
            System.out.println("");
            System.out.println("Você deve primeiro abir o livro!");
            System.out.println("");
        } else {
            System.out.println("Não é possível voltar mais páginas, você "
                    + "já esta na primeira página");
            System.out.println("    Página atual: " + getPaginaAtual());
        }
    }

}
