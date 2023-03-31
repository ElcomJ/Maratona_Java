package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

/**
 * Aula_122 - Instant<br />
 * <b>Date</b> trabalha com milisegundos | <b>Instant</b> trabalha com nanosegundos<br />
 * <b>Instante</b> e bastante parecida com a <b>Date</b><br />
 * Um objeto <b>Imutavel</b> quer dizer que quaquer alteração realizada, vai gerar uma nova instância<br />
 * O Z no final do print faz referencia ao <b>ZULU TIME</b> hora neutra<br />
 * Para aplicações usar <b>INSTANT</b>, para o resto usar o <b>LocalDateTime | Date | Time</b><br />
 *
 */

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano()); // Nanosegundo do segundo | max: 999.999.999
        System.out.println(Instant.ofEpochSecond(3));
        System.out.println(Instant.ofEpochSecond(3, 0));
        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000)); // 1B de nanosegundos = 1 segundo
        System.out.println(Instant.ofEpochSecond(3, -1_000_000_000));
    }
}
