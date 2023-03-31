package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.List;

/**
 * Aula_184 | Aula_185 - <b>Wildcard</b><br />
 * <b>List.of(...)</b> serve para passar atributos para a classe sem chamar o <b>add</b><br />
 * <b>?</b> é o wildcard<br />
 * Quando usamos <b>Wildcard</b> não podemos adicionar elementos a Lista<br />
 * Só pode usar o <b>extends</b><br />
 * <b>extends</b> recebe um Animal ou qualquer filho<br />
 * <b>super</b> recebe um Animal ou um Pai<br />
 *
 */

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        printConsulta(cachorros);
        printConsulta(gatos);
    }

    // Type erasure
    private static void printConsulta(List<? extends Animal> animals) { // Animal > | Somente para leitura
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    private static void printConsultaAnimal(List<? super Animal> animals) { // < Animal
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
