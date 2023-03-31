package academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

/**
 * Aula_104<br />
 * Aqui aprendemos a como criar as nossas próprias excessões customizadas.<br />
 * <b>'checked'</b> quem chama e forçado a fazer tratamento.<br />
 * <b>'unchecked'</b> quem chama não é forçado a fazer tratamento.<br />
 *
 */
public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super("Login inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
