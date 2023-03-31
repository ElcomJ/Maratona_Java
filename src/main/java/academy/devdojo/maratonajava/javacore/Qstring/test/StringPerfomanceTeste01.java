package academy.devdojo.maratonajava.javacore.Qstring.test;

/**
 * Aula_110<br />
 * Quanto maior a quantidade de Strings <b>UNICAS</b>, maior vai ser o tempo de demora de resposta<br />
 * <b>StringBuilder</b> performa bem mais que o método padrão de inserção<br />
 * <b>Threads</b> varias pessoas acessando o mesmo recurso<br />
 * O uso desses dois método e quando você está trabalhando com muita concatenação de Strings, e isso está pesando na performance do sistema<br />
 *
 */
public class StringPerfomanceTeste01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String" + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder" + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer" + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto = texto + i; // 0,01,012,0123
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho); // bem mais performático
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho); // Para ambientes de multiplos Threads
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
