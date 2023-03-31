package academy.devdojo.maratonajava.javacore.Qstring.test;

/**
 * Aula_111<br />
 * String são <b>IMUTAVEIS</b>.<br />
 * Com o uso de <b>StringBuilder</b> mata o conceito de imutavel das strings<br />
 * Quando for usar um método da <b>StringBuilder</b> verificar o tipor de retorno dele<br />
 * Se for <b>StrinBuilder</b> ele vai alterar no <b>Objeto</b>.<br />
 * Se for <b>String</b> precisamos criar outra variável para armazenar o valor.<br />
 *
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" DevDojo");
        nome.substring(0, 3); // end - 1
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("William Suane"); // Se não passar nada, 16 bits é o padrão
        sb.append(" Devdojo").append(" Academy"); // Muda a String sem precisar alocar espaço na constat pool e apontar para ela
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3); // end - 1
        System.out.println(sb); // Ele transforma o Valor recebido em uma String
    }
}
