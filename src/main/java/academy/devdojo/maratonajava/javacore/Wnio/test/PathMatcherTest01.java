package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/**
 * Aula_156 - <b>PathMatcher</b><br />
 * Usa o mesmo conceito de regex, para fazer a busca de arquivo<br />
 *
 */
public class PathMatcherTest01 {
    public static void main(String[] args) {

        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");
        matches(path1, "glob:*.bkp"); // Encontra somente arquivo
        matches(path1, "glob:**.bkp"); // Encontra diretório
        matches(path1, "glob:**/*.bkp"); // Mesmo efeito do anterior
        matches(path1, "glob:**/*.{bkp,txt,java}"); // Busca mais de 1 tipo NÃO USAR ESPAÇO APÓS A VÍRGULA
        matches(path2, "glob:**/*.{bkp,txt,java}");
        matches(path3, "glob:**/*.{bkp,txt,java}");
        matches(path1, "glob:**/*.???"); // Busca por 3 letras na extensão do arquivo
        matches(path2, "glob:**/*.???");
        matches(path3, "glob:**/*.???");
        matches(path3, "glob:**/file.????"); // Busca pelo arquivo com 3 letras de extensão

    }

    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
