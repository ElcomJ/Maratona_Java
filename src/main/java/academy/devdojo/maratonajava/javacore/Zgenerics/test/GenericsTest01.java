package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

/**
 * Aula_183 - <b>Generics</b><br />
 * Generics funciona em tempo de <b>COMPILAÇÃO</b><br />
 * O generic faz com que possamos passar um tipo de uma Collections na criação dela<br />
 * Ex: List<<b>String</b>> lista = new ArrayList<>();<br />
 * <b>Type Erasure</b> apaga o tipo da Collection no bytecode quando é compilado<br />
 * Quando usamos <b>Generics</b> ele faz uma pré validação e não deixa o seu código passar para a JVM se o que ele receber não for do tipo do Generic passado<br />
 *
 */
public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Midoriya");

        for (String s : lista) {
            System.out.println(s);
        }

        add(lista, new Consumidor("Midoriya"));
    }

    private static void add(List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }
}
