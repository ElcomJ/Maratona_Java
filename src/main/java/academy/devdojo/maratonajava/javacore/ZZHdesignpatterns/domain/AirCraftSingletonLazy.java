package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Aula_249 - <b>Design Pattern - Singleton</b><br />
 * Precisa ter cuidado com o uso de Multi Thread para mais de 1 pessoa não conseguir acessar ao mesmo tempo<br />
 * Para resolver o problema anterior, precisamos utilizar um <b>Double Lock</b><br />
 *
 */
public class AirCraftSingletonLazy {
    // Lazy initialization
    private static AirCraftSingletonLazy INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AirCraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AirCraftSingletonLazy getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (AirCraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AirCraftSingletonLazy("787-900");
                }
            }
        }
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
