package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Aula_145<br />
 * <b>Files.createDirectory</b> = Cria uma pasta<br />
 * <b>Files.createDirectories</b> = Cria multiplas pastas, mesmo se não tiver pai<br />
 */
public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");
        if (Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath); // Não funciona com subpastas
        }
        Path subPastaPath = Paths.get("pasta/subpasta/subpasta");
        Path subPastaDirectory = Files.createDirectories(subPastaPath); // Funciona para subpastas

        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING); // Copia os valores de um arquivo para o outro
    }
}
