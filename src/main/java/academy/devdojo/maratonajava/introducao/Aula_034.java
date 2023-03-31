package academy.devdojo.maratonajava.introducao;

/**
 * Arrays pt 03
 */
public class Aula_034 {
    public static void main(String[] args) {

        // Arrays são objetos, por isso precisamos instanciar para usar

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Hinata";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
