package com.reis.herancapt2;

/**
 *
 * @author reis
 */
public class HerancaPt2 {

    public static void main(String[] args) {

        //Pessoa é uma classe abstrata, logo, não deve ser instânciada.
        Visitante visitante = new Visitante();
        Aluno aluno = new Aluno();
        Bolsista bolsista = new Bolsista();

        /**
         * Visitante é uma herança de implementação, ou seja, não há métodos
         * ou atributos na classe.
         */
        visitante.setNome("Pedro Luiz");
        visitante.setIdade(22);
        visitante.setSexo("M");

        //Aluno é uma especialização de Pessoa, Aluno é classe filha de Pessoa.
        aluno.setNome("Arturo Romano");
        aluno.setIdade(23);
        aluno.setSexo("M");
        aluno.setMatricula(1234);
        aluno.setCurso("Programação");

        /**
         * Bolsista é uma especialização de Aluno, que é uma especialização de 
         * Pessoa, Bolsita também é uma folha na árvore hierarquia. Bolsista
         * também implementa a sobre posição do método pagar mensalidade (herdado
         * da classe Aluno) @override. Primeiro exemplo de polimorfismo, é o mesmo
         * obejto com um corportamento diferente de sua mãe.
         */
        bolsista.setNome("Maria Da Graça");
        bolsista.setIdade(19);
        bolsista.setSexo("F");
        bolsista.setMatricula(2345);
        bolsista.setCurso("Física");
        bolsista.setBolsa(20);

        System.out.println(aluno.pagarMensalidade());
        System.out.println(bolsista.pagarMensalidade());
        System.out.println(bolsista.renovarBolsa());
        System.out.println(visitante.getIdade());
    }
}
