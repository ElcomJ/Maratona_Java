package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Pessoa;

/**
 * Aula_054
 */
public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(); // Cria referencia, instancia objeto
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
        pessoa.imprime();
    }
}
