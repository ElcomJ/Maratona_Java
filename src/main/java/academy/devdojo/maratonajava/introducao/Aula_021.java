package academy.devdojo.maratonajava.introducao;

/**
 * Estruturas Condicionais pt 02 - ELSE IF
 */
public class Aula_021 {
    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }

        System.out.println();

        int idade2 = 13;
        String categoria;

        if (idade2 < 15) {
            categoria = "Categoria Infantil";
        } else if (idade2 >= 15 && idade2 < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulta";
        }

        //categoria = idade2 < 15 ? "Categoria Infantil" : idade2 >= 15 && idade2 < 18 ? "Categoria Juvenil" : "Categoria Adulto;"

        System.out.println(categoria);
    }
}
