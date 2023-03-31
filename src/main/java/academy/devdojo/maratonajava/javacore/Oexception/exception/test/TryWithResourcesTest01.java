package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Leitor2;

import java.io.*;

/**
 * Aula_103<br />
 * Para não precisar sempre fechar o arquivo usar bloco finally, pode usar p <b>try with resources</b>.<br />
 * Ele automaticamente fecha a conexão com o Objeto em uso após encerrar o bloco<br />
 * Se for aplicar método próprios de Classes, lembre de implementas a interface <b>Closeabe</b> para ter a função de fechar a stream<br />
 *
 */
public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() { // Método usando o Closeable
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()) {  // Eles são executados na ordem inversa

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerArquivo2() { // Método sem usar o Closeable
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
