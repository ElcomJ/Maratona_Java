package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Aula_153 - <b>DirectoryStream</b><br />
 * Essa classe é para poder trabalhar com <b>Diretórios</b><br />
 * Precisa Iterar no DirectoryStream para pode correr e mostrar todos os <b>Diretórios</b><br />
 *
 */
public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get(".");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) { // Auto close na função com o resources
            for (Path path : stream) {
                System.out.println(path.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
