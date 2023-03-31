package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

/**
 * Aula_099<br />
 * Exception do tipo <b>checked</b> precisa ser tratada.<br />
 * Sempre tentrar tratar a Exception mais especifica para o Erro, não a mais generica como <b>Exception e</b><br />
 * Nem sempre o try catch é benéfico<br />
 * Quando usar o throws 'exception', quem chama o método precisa tratar ele<br />
 * Método privado, usar <b>try catch</b><br />
 * Método publico, usar <b>throws 'exception'</b><br />
 * Tipo <b>RuntimeException</b> fica a critério da pessoa fazer o tratamento do problema.<br />
 */
public class ExceptionTest02 {
    public static void main(String[] args) throws IOException { // joga para o método main tratar a exception
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException { // checked
        File file = new File("arquivo/teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e; // relançando a exception
        }
    }
}
