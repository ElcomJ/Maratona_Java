package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Aula_146 - <b>Normalização</b><br />
 *
 */
public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/william/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize()); // Normaliza o Path

        Path path2 = Paths.get("/home/./william/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}