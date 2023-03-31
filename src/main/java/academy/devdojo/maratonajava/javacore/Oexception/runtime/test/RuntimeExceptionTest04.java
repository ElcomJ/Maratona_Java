package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Aula_101 | Aula_102<br />
 * Nunca colocar um tipo de 'exception' mais <b>genérica</b> a frente de outras<br />
 * Pode abusar do polimorfismo e botar a classe de erro mais acima na herança<br />
 * Pode usar o | para poder colocar mais de 1 <b>exception</b> quando não são da mesma linha de <b>'herança'</b><br />
 */
public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }


        try {
            talvezLanceException();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

    }

    private static void talvezLanceException() throws SQLException, IOException {

    }
}
