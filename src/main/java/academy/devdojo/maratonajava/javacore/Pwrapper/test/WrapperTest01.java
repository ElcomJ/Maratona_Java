package academy.devdojo.maratonajava.javacore.Pwrapper.test;

/**
 * Aula_106 | Aula_107<br />
 * <b>Wrapper</b> são objetos que encapsulam os tipos primitivos.<br />
 * Os tipos <b>Wrappers</b> são relacionados ao <b>'Polimorfismo'</b>, não a quantidade de bits.<br />
 * Um tipo <b>Wrapper</b> não é mais um tipo <b>primitivo</b>, e sim uma <b>Classe</b>.<br />
 * <b>AutoBoxing</b> Quando o Java transforma o tipo primitivo em <b>Wrapper</b><br />
 * <b>Unboxing</b> Quando o Java transforma o tipo <b>Wrapper</b> em tipo primitivo.<br />
 *
 */
public class WrapperTest01 {
    public static void main(String[] args) {

        // Tipos Primitivos

        byte byteP = 1;
        short shotP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        // Tipos Wrappers

        Byte byteW = 127;
        Short shotW = 1;
        Integer intW = 1;  // autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW;  // unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("TruE");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
