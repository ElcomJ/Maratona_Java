package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.AirCraftSingletonEager;
import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.AirCraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Aula_249 - <b>Design Pattern - Singleton</b><br />
 * O <b>Singleton</b> é usado para multiplas classes que forem usar um Objeto Aircraft, usem o mesmo espaço em memória<br />
 * Ao utilizar o conceito de <b>Reflection</b> podemos realizar ações sem saber oque tem na classe<br />
 * Ter cuidado ao usar o <b>Reflection</b> pois isso afeta muito a performance do programa<br />
 *
 */
public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AirCraftSingletonEager.getINSTANCE());
        System.out.println(AirCraftSingletonEager.getINSTANCE());

        // Reflection abaixo:
        Constructor<AirCraftSingletonLazy> constructor = AirCraftSingletonLazy.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        AirCraftSingletonLazy airCraftSingletonLazy = constructor.newInstance("787-900");
        System.out.println(airCraftSingletonLazy);
    }

    private static void bookSeat(String seat) {
        System.out.println(AirCraftSingletonEager.getINSTANCE());
        AirCraftSingletonLazy aircraft = AirCraftSingletonLazy.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }
}
