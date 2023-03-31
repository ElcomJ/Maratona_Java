package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.AirCraftSingletonEager;
import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.Aircraft;

/**
 * Aula_248 - <b>Design Pattern - Singleton</b><br />
 * O <b>Singleton</b> é usado para multiplas classes que forem usar um Objeto Aircraft, usem o mesmo espaço em memória<br />
 *
 */
public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    static void bookSeat(String seat) {
        System.out.println(AirCraftSingletonEager.getINSTANCE());
//        Aircraft aircraft = new Aircraft("787-900");
//        System.out.println(aircraft.bookSeat(seat));
    }
}
