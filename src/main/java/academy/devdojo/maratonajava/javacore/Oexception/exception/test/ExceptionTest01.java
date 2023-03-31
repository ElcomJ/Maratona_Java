package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

/**
 * Aula_097<br />
 * Exception do tipo <b>checked</b> precisa ser tratada.<br />
 * Sempre tentrar tratar a Exception mais especifica para o Erro, não a mais generica como <b>Exception e</b><br />
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo/teste.txt");
        try { // Precisa de um método para poder funcionar o catch de tratamento de erro
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
