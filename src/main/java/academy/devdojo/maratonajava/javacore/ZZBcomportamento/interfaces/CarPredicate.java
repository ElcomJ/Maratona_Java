package academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;

@FunctionalInterface
public interface CarPredicate {
    // anonimas, funções, conciso
    boolean test(Car car);
    // (parametro) -> <expressão>
    // (Car car) -> car.getColor().equals("green");
}
