package com.reis.exercicios;

/**
 *
 * @author reis
 */
public class Exercicios {

    public static void main(String[] args) {

        Pessoa[] pessoas = new Pessoa[3];
        Livro[] livros = new Livro[3];

        pessoas[0] = new Pessoa("Reis", 0, 33, 'M');
        pessoas[1] = new Pessoa("Zarpelon", 1, 31, 'F');
        pessoas[2] = new Pessoa("De Marchi", 2, 12, 'F');

        livros[0] = new Livro("Programas Não Esquecidos", "Java", 128);
        livros[1] = new Livro("A Arte Moderna", "CSS", 256);
        livros[2] = new Livro("Marcações Profundas", "HTML", 64);

        for (Livro livro : livros) {
            livro.detalhes();
        }
        
        pessoas[0].fazerAniversario();
        livros[0].getLeitor();
        livros[0].setLeitor(pessoas[0]);
        livros[0].detalhes();
    }
}
