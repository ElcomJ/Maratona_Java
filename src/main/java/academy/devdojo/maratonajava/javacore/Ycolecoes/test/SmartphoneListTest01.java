package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

/**
 * Aula_168 - <b>List</b><br />
 * Sempre lembrar de adicionar a classe toString nas classes de <b>Domain</b><br />
 * <b>clear</b> limpa a Collection<br />
 * <b>constains</b> verifica se um item existe na Collection<br />
 * <b>indexOf</b> Retorna o indice de um valor, se não existir retorna -1 <br />
 * <b>get</b> retorna o valor do indice<br />
 */
public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("22222", "Pixel"); // Usar IF para não pegar algo que não existe
        System.out.println(smartphones.contains(s4));

        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(indexSmartphone4);
        System.out.println(smartphones.get(indexSmartphone4)); // Retorn os valores nesse indice
    }
}
