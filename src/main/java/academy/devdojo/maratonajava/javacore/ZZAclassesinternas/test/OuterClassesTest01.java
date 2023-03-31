package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

/**
 * Aula_189 - <b>Classes Internas</b><br />
 * <b>Classes Internas</b> são classes dentro de outras classes<br />
 * Para criar um Objeto da classe interna, precisa de um Objeto da classe externa<br />
 * o <b>this</b> em classe interna, se refere ao nivel de contexto que ele se encontra<br />
 *
 */
public class OuterClassesTest01 {

    private String name = "Monkey D. Luffy";

    // Nested Classes
    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        OuterClassesTest01.Inner inner = outerClass.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();

        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
