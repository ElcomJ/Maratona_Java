package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

/**
 * Aula_092<br />
 * Usar uma variável de referência da <b>Super classe</b> para receber um objeto da <b>Sub classe</b>.<br />
 *
 */
public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);
        if (produto instanceof Tomate) {  // Verifica se o objeto produto é uma instancia do tipo Tomate
            //Tomate tomate = (Tomate) produto;  // casting para o produtor virar Tomate
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
        }
    }
}
