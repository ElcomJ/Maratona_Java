package academy.devdojo.maratonajava.javacore.ZZKjunit.domain;

import java.util.Objects;

/**
 * Aula_283 - <b>Record Class</b><br />
 * <b>Record</b> são classes <b>IMUTÁVEIS</b>>, ela não possuem setters, somente getters<br />
 * <b>Record</b> são classes <b>FINAIS</b><br />
 * Em uma <b>Record Class</b> NÃO podemos criar atributos de INSTÂNCIA diretamente<br />
 * Porém, se forem <b>static</b> de forma que pertence a classe, podem ser criados<br />
 * Podemos utilizar <b>Generics</b><br />
 * Podemos criar contrutores <b>Compact</b> para podermos validar os dados<br />
 */
public record Manga(String name, int episodes) {

    public Manga {
        Objects.requireNonNull(name);
    }
}
