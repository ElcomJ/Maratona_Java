package academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

import java.io.Closeable;
import java.io.IOException;

/**
 * Aula_103
 */
public class Leitor1 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando Leitor 1");
    }
}
