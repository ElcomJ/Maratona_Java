package academy.devdojo.maratonajava.javacore.Eblocoinicializacao.domain;

/**
 * Aula_060
 */
public class Anime {
    private String nome;
    private int[] episodios;

    // 1 - Aloca espaço em memória para o objeto
    // 2 - Cada atributo de classe e criado e inicializado com valores default ou o quer for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    { // Bloco de inicialização de instância
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
