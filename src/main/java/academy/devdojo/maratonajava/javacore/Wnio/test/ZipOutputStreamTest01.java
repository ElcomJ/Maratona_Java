package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Aula_158 - <b>ZipOutputStream</b><br />
 * Essa classe faz o <b>zipamento</b> de algo<br />
 * Classes OutputStream possuem a função <b>Closeable</b>, por isso precisa ser fechada.<br />
 *
 *
 */
public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        Path arquivoParaZipar = Paths.get("pasta/subpasta1/subsubpasta1");
        zip(arquivoZip, arquivoParaZipar);
    }

    private static void zip(Path arquivoZip, Path arquivosParaZipar) {
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
             DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)) { // Para dar auto close
            for (Path file : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
            System.out.println("Arquivo criado com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
