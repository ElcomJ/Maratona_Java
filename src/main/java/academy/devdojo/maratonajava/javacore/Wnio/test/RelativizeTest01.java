package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Aula_148 - <b>Relativize</b><br />
 * <b>Relatize</b> pega dois Paths e amostrar como chegar ao Path B a partir do Path A<br />
 *
 */
public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/william");
        Path javaClass = Paths.get("/home/william/devdojofoda/olaMundo.java");

        Path pathToClass = dir.relativize(javaClass);
        System.out.println(pathToClass);

        Path absoluto1 = Paths.get("/home/william");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/william/devdojofoda/olaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.1415161");

        System.out.println("1 " + absoluto1.relativize(absoluto3));
        System.out.println("2 " + absoluto3.relativize(absoluto1));
        System.out.println("3 " + absoluto1.relativize(absoluto2));
        System.out.println("4 " + relativo1.relativize(relativo2));
        System.out.println("5 " + absoluto1.relativize(relativo1));
    }
}