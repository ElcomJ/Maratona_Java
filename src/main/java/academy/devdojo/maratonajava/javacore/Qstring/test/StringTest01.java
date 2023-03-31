package academy.devdojo.maratonajava.javacore.Qstring.test;

/**
 * Aula_108 | Aula_109<br />
 * Strings no Java são <b>IMUTAVEIS</b><br />
 * Dentro do <b>HEAP</b> existe um espaço somente para armazenar variáveis <b>String</b><br />
 * O nome desse espaço é <b>Constant Pool</b> ou pool de String, sempre que criamos uma nova String, ela é armazenada nesse espaço no HEAP<br />
 * Quando se criar um 'new String', o Java cria uma referência dentro da <b>Constant Pool</b> de Strings<br />
 *
 */
public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William"; // String constant pool
        String nome2 = "William";  // nome2 references here
        nome = nome.concat("Suane"); // nome references here | nome += "Suane"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("William"); // 1 reference variable, 2 Object String Type, 3 A String in the Constant pool
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
