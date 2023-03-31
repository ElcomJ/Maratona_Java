package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String next = sc.nextLine();
        System.out.println("Digite a sua idade:");
        int idade = sc.nextInt();
        System.out.println("Digite M ou F para seu sexo");
        char sexo = sc.next().charAt(0);

        System.out.println("--------------------------");
        System.out.println("Nome " +next);
        System.out.println("Idade " +idade);
        System.out.println("Sexo " +sexo);

        sc.close();
    }
}
