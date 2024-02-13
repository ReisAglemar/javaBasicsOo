/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.reis.main;

/**
 *
 * @author reis
 */
public class Heranca {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        Aluno aluno1 = new Aluno();
        Professor professor1 = new Professor();
        Funcionario funcionario1 = new Funcionario();
        
        aluno1.setNome("João Da Silva");
        aluno1.setIdade(23);
        aluno1.setSexo("M");
        aluno1.setCurso("Administração");
        aluno1.setMatricula(123);
        
        professor1.setNome("Pedro De Paula");
        professor1.setIdade(50);
        professor1.setSexo("M");
        professor1.setEspecialidade("Programador");
        professor1.setSalario(6500.00f);
        
        funcionario1.setNome("Maria Da Luz");
        funcionario1.setIdade(32);
        funcionario1.setSexo("F");
        funcionario1.setSetor("Administração");
        funcionario1.setTrabalhando(true);
        
        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.isTrabalhando());
        System.out.println(funcionario1.getSetor());
        funcionario1.mudarSetor("Secertaria");
        System.out.println(funcionario1.getSetor());
        funcionario1.fazerAniversario();
        System.out.println(funcionario1.toString());
        System.out.println(funcionario1.toStringFuncionario());
        
        System.out.println(professor1.toString());
        System.out.println(professor1.toStringProfessor());
    }
}
