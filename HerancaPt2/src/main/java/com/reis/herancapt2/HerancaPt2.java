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
        Bolsista alunoBolsista = new Bolsista();
        Tecnico alunoTecnico = new Tecnico();
        Professor professor = new Professor();

        /**
         * Visitante é uma herança de implementação, ou seja, não há métodos ou
         * atributos na classe.
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
         * também implementa a sobre posição do método pagar mensalidade
         * (herdado da classe Aluno) @override. Primeiro exemplo de
         * polimorfismo, é o mesmo obejto com um corportamento diferente de sua
         * mãe.
         */
        alunoBolsista.setNome("Maria Da Graça");
        alunoBolsista.setIdade(19);
        alunoBolsista.setSexo("F");
        alunoBolsista.setMatricula(2345);
        alunoBolsista.setCurso("Física");
        alunoBolsista.setBolsa(20);

        /**
         * Tecnico é classe herdada de Aluno,
         */
        alunoTecnico.setNome("Juan Marques");
        alunoTecnico.setIdade(18);
        alunoTecnico.setSexo("M");
        alunoTecnico.setMatricula(6789);
        alunoTecnico.setCurso("Dados aplicado");
        alunoTecnico.setRegistroProfissional(5567);

        /**
         * Professor é uma folha que herda a classe Pessoa. Classes folhas levam
         * a palavra FINAL *
         */
        professor.setNome("Oscar Pecorini");
        professor.setIdade(46);
        professor.setSexo("M");
        professor.setEspecialidade("Mestre em desenvolvimento");
        professor.setSalario(7500.90f);

        /**
         *
         * ---------------- TESTANDO AS CLASSES E OBJETOS ----------------------
         *
         * -------------------- CHAMADAS DOS MÉTODOS ---------------------------
         *
         */
        verVisitante(visitante);
        verAluno(aluno);
        verProfessor(professor);
        verBolsista(alunoBolsista);
        verTecnico(alunoTecnico);
        pagarMensalidadeRenovar(aluno, alunoBolsista, alunoTecnico);
    }

    public static void verVisitante(Visitante visitante) {

        System.out.println("");
        System.out.println("---------- Informações de um visitante ----------");
        System.out.println(visitante.getNome());
        System.out.println(visitante.getSexo());
        System.out.println(visitante.getIdade());
        System.out.println("=================================================");
    }

    public static void verAluno(Aluno aluno) {

        System.out.println("");
        System.out.println("------------ Informações de um aluno ------------");
        System.out.println(aluno.getNome());
        System.out.println(aluno.getSexo());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getCurso());
        System.out.println(aluno.getMatricula());
        System.out.println("=================================================");
    }

    public static void verProfessor(Professor professor) {

        System.out.println("");
        System.out.println("----- Informações e métodos de um professor -----");
        System.out.println(professor.getNome());
        System.out.println(professor.getIdade());
        System.out.println(professor.getSexo());
        System.out.println(professor.getEspecialidade());
        System.out.println(professor.getSalario());
        System.out.println("");
        System.out.println(professor.receberAumento(499.10f));
        System.out.println("=================================================");
    }

    public static void verBolsista(Bolsista alunoBolsista) {

        System.out.println("");
        System.out.println("------- informações de um aluno bolsista --------");
        System.out.println(alunoBolsista.getNome());
        System.out.println(alunoBolsista.getSexo());
        System.out.println(alunoBolsista.getIdade());
        System.out.println(alunoBolsista.getCurso());
        System.out.println(alunoBolsista.getMatricula());
        System.out.println("=================================================");
    }

    public static void verTecnico(Tecnico alunoTecnico) {

        System.out.println("");
        System.out.println("--- Informações e métodos de um aluno técnico ---");
        System.out.println(alunoTecnico.getNome());
        System.out.println(alunoTecnico.getIdade());
        System.out.println(alunoTecnico.getSexo());
        System.out.println(alunoTecnico.getMatricula());
        System.out.println(alunoTecnico.getCurso());
        System.out.println(alunoTecnico.getRegistroProfissional());
        System.out.println("");
        System.out.println(alunoTecnico.praticar("Estágio em dados"));
        System.out.println("=================================================");
    }

    public static void pagarMensalidadeRenovar(Aluno aluno, Bolsista alunoBolsista, Tecnico alunoTecnico) {

        System.out.println("---- pagamento de mensalidades e renovações -----");
        System.out.println(aluno.pagarMensalidade());
        System.out.println(alunoBolsista.pagarMensalidade());
        System.out.println(alunoTecnico.pagarMensalidade());
        System.out.println(alunoBolsista.renovarBolsa());
        System.out.println("=================================================");
    }
}
