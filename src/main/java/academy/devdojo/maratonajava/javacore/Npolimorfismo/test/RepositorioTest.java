package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.RepositorioBancoDeDados;

/**
 * Aula_094<br />
 * Programação Orientada a Interface condiz em abstrair ao nivel mais genérico a variavel de referência e modificar somente a instância<br />
 *
 */
public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
