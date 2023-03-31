package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

/**
 * Aula_201 - <b>Optional</b><br />
 * <b>Optional</b> é uma classe para poder fazer de forma mais funcional o retorno negativo de uma classe<br />
 * E uma classe funcional para ajudar a forma de retorno de resultados<br />
 * Optional <b>NÃO</b> pode ser usado como <b>Parametro</b> ou <b>Variavel</b> de classe <br />
 *
 */
public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Aha uhu o DevDojo é foda.");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println("------------");

        Optional<String> nameOptional = findName("William");
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static Optional<String> findName(String name) {
        List<String> list = List.of("William", "DevDojo");
        int i = list.indexOf(name);
        if (i != 1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
