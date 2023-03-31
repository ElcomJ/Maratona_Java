package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

/**
 * Aula_190 - <b>Classes Locais</b><br />
 * Nesta aula aprendemos a criar classes locais dentro de métodos<br />
 * Sempre que usar classe local, precisa inicializar essa classe no método<br />
 * Pode-se usar modificadores de acesso no método que a classe é criada<br />
 */
public class OuterClassesTest02 {
    private String name = "Midorya";

    void print(final String param) {
        final String lastName = "Izuku";
        class LocalClass {
            public void printLocal() {
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("Hello");
    }
}
