package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Aula_142 - <b>IO</b> - <b>BufferedReader</b><br />
 * <b>Try with Resources</b> para dar auto close no reader<br />
 * <b>BufferedReader</b> lê a linha inteira ao invés de ler caracter por caracter<br />
 * Retorna <b>1</b> quando chega ao final do arquivo<br />
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) { // Encapsula o FileReader no BufferedReader
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
