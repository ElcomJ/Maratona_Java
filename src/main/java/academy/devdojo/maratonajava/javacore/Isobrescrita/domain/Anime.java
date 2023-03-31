package academy.devdojo.maratonajava.javacore.Isobrescrita.domain;

/**
 * Aula_076
 */
public class Anime { // Todas as classes por padrão extends a classe Object
    private String nome;

    @Override  // Override é usado para confirmar que está sobreescrevendo algo
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
