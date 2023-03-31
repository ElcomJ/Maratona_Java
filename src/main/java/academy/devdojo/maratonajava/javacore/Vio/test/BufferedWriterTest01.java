package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Aula_141 - <b>IO</b> - <b>BufferedWriter</b><br />
 * <b>Try with Resources</b> para fechar sozinho a classe<br />
 * <b>FileWriter</b> recebe um <b>File</b> dentro do Construtor<br />
 * <b>BufferedWriter</b> recebe um <b>FileWriter</b> dentro do Construtor<br />
 * É possivel especificar o tamanho do <b>Buffer</b> direto no construtor se o arquivo for muito grande<br />
 * Nem todo sistema reconhece o <b>'\n'</b> como quebra de linha, usar o <b>newLine</b> do <b>BufferedWriter</b><br />
 *
 */
public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true); // Escapsula o FileWriter no BufferedWriter
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("O DevDojo é lindo, é o melhor curso do brasilllll"); // Usar \n pode dar problema
            bw.newLine(); // Escreve uma nova linha, independendo do sistema o peracional
            bw.flush(); // Limpa o Buffer em memória antes de fechar o arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
