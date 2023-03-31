package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.AirCraftSingletonEager;

/**
 * Aula_248 - <b>Design Pattern - Singleton</b><br />
 * O <b>Singleton</b> é usado para multiplas classes que forem usar um Objeto Aircraft, usem o mesmo espaço em memória<br />
 *
 */
public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        AircraftTest01.bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        System.out.println(AirCraftSingletonEager.getINSTANCE());
        AirCraftSingletonEager aircraft = AirCraftSingletonEager.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }
}
