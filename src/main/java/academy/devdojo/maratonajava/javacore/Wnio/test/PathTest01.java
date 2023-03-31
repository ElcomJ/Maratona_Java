package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Aula_144 - <b>NIO</b> - <b>Path, Paths, Files</b><br />
 *
 */
public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("/home/elcomj/Documents/Dev/Cursos/Youtube/Maratona_Java/file.txt");
        Path p2 = Paths.get("/home/elcomj/Documents/Dev/Cursos/Youtube/Maratona_Java", "file.txt"); // Usando VarArgs
        Path p3 = Paths.get("/", "home/elcomj/Documents/Dev/Cursos/Youtube/Maratona_Java", "file.txt");
        Path p4 = Paths.get("/", "home", "elcomj", "Documents", "Dev", "Cursos", "Youtube", "Maratona_Java", "/file.txt");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
