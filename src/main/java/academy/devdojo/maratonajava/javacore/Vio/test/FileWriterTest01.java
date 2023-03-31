package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Aula_139 - <b>IO</b> - <b>FileWriter</b><br />
 * <b>File</b><br />
 * <b>FileWriter</b> - Escrita <b>NÃO</b> otimizada<br />
 * <b>FileReader</b> - Leitura <b>NÃO</b> otimizada<br />
 * <b>BufferedWriter</b> - Escrita <b>OTIMIZADA</b><br />
 * <b>BufferedReader</b> - Leitura <b>OTIMIZADA</b><br />
 * Lembrar de usar o <b>Try with Resources</b> para fechar automaticamento o escritor ou leitor de um arquivo<br />
 * Ao passar o <b>true</b> no construtor do escritor, ele ao invés de apagar o arquivo, ele vai adicionar o novo valor a ele<br />
 * Deve ter cuidado com o append, senão ele vai escrever valores duplicados se não limpar o valor anterior<br />
 * <b>flush</b> limpa o buffer em memória.
 */
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file , true)) { // Para não precisar fechar o arquivo manualmente, o Closeabe faz isso
            fw.write("O DevDojo é lindo, é o melhor curso do brasilllll");
            fw.flush(); // Limpa o Buffer em memória antes de fechar o arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
