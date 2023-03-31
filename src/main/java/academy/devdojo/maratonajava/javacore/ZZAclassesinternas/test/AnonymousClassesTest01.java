package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

/**
 * Aula_191 - <b>Anonymous Classes</b><br />
 * <b>Classes Anônimas</b> são classes que iram existir por um momento e não pode ser reutilizada<br />
 * Uma classe anônima, é uma classe que criamos quando queremos alterar um método somente para um pedaço de código<br />
 *
 */

class Animal {
    public void walk() {
        System.out.println("Animal walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){ // Anonymous Class | Animal Subclass

            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();
    }
}
