package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

/**
 * Aula_143 - <b>IO</b> - <b>File para diretórios</b><br />
 * Você pode passar a variavel da pasta para criar o arquivo dentro dela<br />
 */
public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean mkdir = fileDiretorio.mkdir();// Cria um novo diretório
        System.out.println(mkdir);

        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt"); // Cria um novo arquivo no diretório
        boolean newFile = fileArquivoDiretorio.createNewFile();
        System.out.println(newFile);

        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt"); // Renomeia o arquivo no diretório
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenamed); // Renomeia o diretório
        System.out.println(isDiretorioRenomeado);
    }
}
