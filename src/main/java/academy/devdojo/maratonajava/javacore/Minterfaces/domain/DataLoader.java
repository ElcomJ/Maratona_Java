package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

/**
 * Aula_087 | Aula_088 | Aula_089<br />
 * Uma <b>interface</b> é um contrato feito para ser implementado.<br />
 * <b>Interface</b> é um contrato, aonde todos os métodos por padrão serão <b>public</b> e <b>abstract</b>.<br />
 * Em uma interface no java todos os métodos são <b>public abstract</b>.<br />
 * Ao usar <b>default</b> se cria um método concreto, que não necessita ser sobrecarregado em cada classe que implementar a interface.<br />
 * Todos os <b>atributos</b> em uma <b>Interface</b> são constanter (<b>static final</b>).<br />
 */
public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();
    public default void checkPermission() {  // método concreto
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize() { // static só a classe pode chamar
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
