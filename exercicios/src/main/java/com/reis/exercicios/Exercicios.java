package com.reis.exercicios;

/**
 *
 * @author reis
 */
public class Exercicios {

    public static void main(String[] args) {

        Pessoa[] pessoas = new Pessoa[3];
        Livro[] livros = new Livro[3];

        pessoas[0] = new Pessoa("Reis", 33, 'M');
        pessoas[1] = new Pessoa("Zarpelon", 31, 'F');
        pessoas[2] = new Pessoa("De Marchi", 12, 'F');

        livros[0] = new Livro("Programas Não Esquecidos", "Java", 128, pessoas[0]);
        livros[1] = new Livro("A Arte Moderna", "CSS", 256, pessoas[1]);
        livros[2] = new Livro("Marcações Profundas", "HTML", 64, pessoas[2]);

        livros[0].avançarPagina();
        livros[0].abrir();
        livros[0].avançarPagina();        
        livros[0].avançarPagina();
        

    }
}
