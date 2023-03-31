package academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

/**
 * Aula_105<br />
 * Exceções do tipo Runtime, não é obrigatório a fazer tratamento.<br />
 * Quando fazer um Overwrite de uma função com exceções no método, podemos ou não lançar as <b>exceções</b><br />
 * Não podemos lançar um tipo mais genêrico do que o da super classe de Exception.<br />
 * Não podemos lançar nenhum exceção do tipo checked que não foi declarada no método original. <br />
 *
 */
public class Funcionario extends Pessoa{
    public void salvar() throws LoginInvalidoException, ArithmeticException{
        System.out.println("Salvando funcionario");
    }
}
