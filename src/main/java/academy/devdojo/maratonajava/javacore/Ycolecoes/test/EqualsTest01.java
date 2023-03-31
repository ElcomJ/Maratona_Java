package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

/**
 * Aula_161 | Aula_162 - <b>Equals</b><br />
 * Se tiver duvida sobre String, ver o pacote <b>Qstring</b><br />
 * <b>Equals</b> compara o valor de duas strings, independente se estão na pool ou não<br />
 * <b>Equals</b> com Objetos compara se as duas variaveis estão fazendo referência para o mesmo Objeto em memória<br />
 *
 */
public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "iPhone");
        System.out.println(s1.equals(s2));
    }
}
