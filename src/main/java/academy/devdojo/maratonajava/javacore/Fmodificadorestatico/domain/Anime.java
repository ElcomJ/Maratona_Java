package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

/**
 * Aula_063
 * <br /><br />
 * Bloco de Inicialização estático<br /><br />
 * - Atributos de instância não pode ser acessados em blocos ou métodos estáticos<br /> porque ele não existem em memória quando o static é executado.
 */
public class Anime {
    private String nome;
    private static int[] episodios;

    // 0 - Bloco de inicialização estático é executado quando a JVM carregar a classe
    // 1 - Aloca espaço em memória para o objeto
    // 2 - Cada atributo de classe e criado e inicializado com valores default ou o quer for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    static { // Bloco de inicialização de instância estático | Se tiver mais de um são executados na ordem
        System.out.println("Dentro do bloco de inicialização estático");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
