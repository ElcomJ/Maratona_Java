package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

/**
 * Aula_098<br />
 * <b>throw new</b> = lança novo 'exception' do time <b>'RuntimeException'</b>.<br />
 * "método" <b>throws 'exception'</b> = existe possibilidade de lançar a 'exception'<br />
 * <b>throws 'exception'</b> não é necessário quando é do tipo <b>RuntimeException</b>, porém é obrigatório quando é do time <b>Checked</b>. Pois precisar avisar a quem for chamar o método que precisar tratar ele.<br />
 *
 */
public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1, 0);
    }

    private static int divisao(int a, int b) throws IllegalArgumentException{
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a / b;
    }
}
