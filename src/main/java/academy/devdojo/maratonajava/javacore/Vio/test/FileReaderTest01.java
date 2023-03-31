package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Aula_140 - <b>IO</b> - <b>FileReader</b><br />
 * Se usar o <b>read</b> ele vai retornar o valor <b>ASCII</b> do primeiro Caracter do arquivo<br />
 * O read retorna o total de <b>Caracters</b> lido para dentro de um array se você usar um <br />
 * Retorn <b>-1</b> quando chega ao final do arquivo<br />
 *
 */
public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)) { // Fecha automaticamente o Reader depois que terminar de ler
//            char[] in = new char[30];
//            fr.read(in);
//            for (char c : in) {
//                System.out.print(c);
//            }
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
