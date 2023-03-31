package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Aula_166 | Aula_167 - <b>List</b><br />
 * List nomes = new ArrayList(); forma antiga<br />
 * o <b><></b> serve para poder passar o tipo da Collection em tempo de compilação<br />
 * É possivel definir um tamanho inicial para a Lista, porém ao estorar o valor ele duplica 16 -> 32 -> 64<br />
 * O segundo <b><></b> nas versões atuais não é obrigatório<br />
 * Collections são orientadas a <b>Interfaces</b><br />
 * A variavel de referência sempre será uma Interface, e a instância o tipo<br />
 * Sempre focar no <b>Big O Notation</b><br />
 * O valor passado no tipo da lista, precisa usar Wrapper, não atributos primitivos<br />
 * Precisa passar um <b>Object</b> no tipo da <b>Collection</b><br /><br />
 * <b>add</b> adiciona um valor<br />
 * <b>remove</b> remove um valor<br />
 * <b>addAll</b> adiciona tudo de uma Collection em outra (ser do mesmo tipo)<br />
 * <b>size</b> pega o tamanho da Collection {0, 1, 2, 3} = nomes.size() = 4<br />
 *
 */
public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("William");
        nomes.add("DevDojo Academy");
        nomes2.add("Suane");
        nomes2.add("Academy");

        //nomes.remove("William");

        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("-----------------------------");

        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
    }
}
