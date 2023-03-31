package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

/**
 * Aula_104<br />
 * Aprendendo a utilizar exceção customizada
 */
public class LogininvalidoExceptionTeste01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException { // precisa declarar porque é do tipo checked

        Scanner sc = new Scanner(System.in);

        String usernameDB = "Goku";
        String senhaDB = "ssj";

        System.out.println("Usuário: ");
        String usernameDigitado = sc.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = sc.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");

        sc.close();
    }
}
