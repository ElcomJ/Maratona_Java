package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.Seminario;

/**
 * Aula_070
 */
public class AssociacaoTest {
    public static void main(String[] args) {

        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}
