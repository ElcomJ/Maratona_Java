package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

/**
 * Aula_138 - <b>IO</b> - <b>File</b><br />
 * createNewFile = <b>CRIA</b> um novo arquivo | <b>'checked'</b>, precisa ser tratado<br />
 * delete = <b>DELETA</b> um arquivo<br />
 * exists = Verifica se o arquivo <b>EXISTE</b> e retorna um valor <b>Boolean</b><br />
 */
public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created " + isCreated);
            System.out.println("path " + file.getPath()); // Path
            System.out.println("path absolute " + file.getAbsolutePath()); // Path Absoluto
            System.out.println("is directory " + file.isDirectory()); // Verifica se é um diretório
            System.out.println("is file " + file.isFile()); // Verifica se é um arquivo
            System.out.println("is hidden " + file.isHidden()); // Verifica se é oculto
            System.out.println("is readable " + file.canRead()); // Verifica se pode ser lido
            System.out.println("Last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault())); // Verifica a ultima modificação | Date para ver a data
            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted " + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
