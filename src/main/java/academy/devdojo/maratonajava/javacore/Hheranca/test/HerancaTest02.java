package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;

/**
 * Aula_075<br />
 * Primeiro ele executa os métodos estáticos do Pai e depois o do Filho, o mesmo vale para os Blocos de Inicialização.
 */
public class HerancaTest02 {
    // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar a classe filha
    // 2 - Aloca espaço em memória para o objeto da super classe
    // 3 - Cada atributo de super classe e criado e inicializado com valores default ou o quer for passado da classe pai
    // 4 - Bloco de inicialização da super classe é executado na ordem em que aparece
    // 5 - Construtor da super classe é executado
    // 6 - Aloca espaço em memória para o objeto da sub classe
    // 7 - Cada atributo de sub classe e criado e inicializado com valores default ou o quer for passado
    // 8 - Bloco de inicialização da sub classe é executado na ordem em que aparece
    // 9 - Construtor da sub classe é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
