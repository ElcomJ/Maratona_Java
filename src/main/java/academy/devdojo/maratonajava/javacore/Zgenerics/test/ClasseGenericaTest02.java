package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;

/**
 * Aula_186 - <b>Classes Genéricas</b><br />
 *
 */
public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o carro por um mês...");
        barcoRentavelService.retornarBarcoAlugador(barco);
    }
}
