package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.Person;

/**
 * Aula_246 - <b>Design Patterns - Builder</b><br />
 * O <b>Builder</b> e uma forma de organizar a criação do objeto de forma facil<br />
 *
 */
public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("William")
                .lastName("Suane")
                .username("ViradoNoJiraya")
                .email("william.suane@devdojo.academy")
                .build();

        System.out.println(build);
    }
}
