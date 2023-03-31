package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

/**
 * Aula_192 - <b>Classes aninhadas estáticas | Outer Statics Classes</b><br />
 * Uma classe static é uma high level class, onde ela se comunica com outras classes high level<br />
 * É uma classe que é feita para se comunicar com a sua classe acima<br />
 * Ver exemplo da <b>Interface Entry</b> na <b>Interface Map</b><br />
 *
 */
public class OuterClassesTest03 {
    private String name = "William";

    static class Nested {
        private String lastName = "Suane";

        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
