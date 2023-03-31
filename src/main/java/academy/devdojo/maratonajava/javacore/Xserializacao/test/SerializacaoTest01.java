package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Xserializacao.domain.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Aula_159 | 160- <b>Serialização</b><br />
 * <b>Serialização</b> é quando se pega um Objeto em memória e <b>Persiste</b> ele<br />
 * Serializar, transforma um <b>Objeto</b> em um <b>Array de Bytes</b><br />
 * <b>InputStream</b> é quando você está lendo<br />
 * <b>OutputStream</b> é quando queremos escrever alguma saída<br />
 * O <b>Construtor</b> não funciona quando fazemos a <b>Descerialização</b> de um arquivo<br />
 * Para ignorar um atributo para ele não ser serializado, usar a keyword <b>transient</b><br />
 * Atributos <b>Static</b> não são Serializados por pertencer a <b>CLASSE</b><br />
 * Para escreve um atributo que não pode ser Serializado, precisamos escrever e ler ele manualmente por um método <b>Na class aluno</b><br />
 *
 */
public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "William Suane", "123412121");
        Turma turma = new Turma("Maratona Java Virado no Jiraya em Breve Ricos");
        aluno.setTurma(turma);
        serializar(aluno);
        descerializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/aluno.ser"); // Vai serializar para esse Path
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void descerializar() {
        Path path = Paths.get("pasta/aluno.ser"); // Vai serializar para esse Path
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
