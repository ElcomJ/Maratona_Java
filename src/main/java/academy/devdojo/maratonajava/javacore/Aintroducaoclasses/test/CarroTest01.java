package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

/**
 * Aula_042 | Aula_043
 */
public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Saveiro";
        carro1.modelo = "Sapo";
        carro1.ano = 2010;

        carro2.nome = "Gol";
        carro2.modelo = "Bola";
        carro2.ano = 2006;

        carro1 = carro2;

        System.out.printf(" Nome: %s%n Modelo: %s%n Ano: %d%n%n", carro1.nome, carro1.modelo, carro1.ano);
        System.out.printf(" Nome: %s%n Modelo: %s%n Ano: %d%n", carro2.nome, carro2.modelo, carro2.ano);

    }
}
