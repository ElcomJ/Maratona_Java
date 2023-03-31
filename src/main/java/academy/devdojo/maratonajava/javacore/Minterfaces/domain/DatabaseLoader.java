package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

/**
 * Aula_087 | Aula_088 | Aula_089<br />
 * Não usar <b>extends</b>, usar <b>implements</b><br />
 * É possivel prover multiplas implementações de interfaces para uma mesma classe.<br />
 */
public class DatabaseLoader implements DataLoader, DataRemover{
    // private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }

    public static void retrieveMaxDataSize() {  // static só a classe pode chamar
        System.out.println("Dentro do retrieveMaxDataSize na classe DataBaseLoader");
    }
}
