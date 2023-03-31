package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Aula_155 - <b>SimplesFileVisitor</b><br />
 * Essa classe corre dentro das <b>PASTAS</b> e retorna o resultado<br />
 * O . representa a pasta atual (Maratona_Java), o <b>Root</b> do projeto<br />
 * <b>ListAllFiles</b> lista todos os arquivos em uma pasta, podendo pegar arquivo de somente um tipo<br />
 * <b>preVisitDirectory</b> é invodado quando entra em um diretório<br />
 * <b>visitFileFailed</b> retorna uma exceção se ocorrer um problema ao acessar um arquivo<br />
 * <b>posVisitDirectory</b> é invocado quando sai de um diretório | As funções <b>SKIP</b> não funcionam aqui<br />
 *
 */

class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("pre visit " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("post visit " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class SimplesFileVisitorTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("pasta");
        Files.walkFileTree(root, new ListAllFiles());
    }
}
