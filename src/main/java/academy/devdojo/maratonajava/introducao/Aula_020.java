package academy.devdojo.maratonajava.introducao;

/**
 * Estruturas Condicionais pt 01 - IF
 */
public class Aula_020 {
    public static void main(String[] args) {

        // IF só executa se for TRUE
        // IF FALSE nunca executa
        // !

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        if (! isAutorizadoComprarBebida) { // IF NOT
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }

    }
}
