package academy.devdojo.maratonajava.javacore.Ycolecoes.domain;

import java.util.Comparator;
import java.util.Objects;

/**
 * Aula_170 | Aula_174<br />
 * compareTo faz o overwrite do que o sort vai fazer<br />
 */


public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "Id não pode ser null");  // Faz com que não possa ser nulo o campo
        Objects.requireNonNull(nome, "Nome não pode ser null");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(getId(), manga.getId()) && Objects.equals(getNome(), manga.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome());
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    // Negativo se o this < o
    // se this == o, return 0
    // positivo se this > o
    @Override
    public int compareTo(Manga o) {
//        if (this.id < o.getId()) {
//            return -1;
//        } else if (this.id.equals(o.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }
//        return Double.valueOf(preco).compareTo(o.getPreco()); // Tudo acima se usar tipo primitivo
//        return Double.compare(preco, o.getPreco()); // Tudo acima se usar tipo primitivo
        return this.nome.compareTo(o.getNome()); // Tudo acima se usar um tipo Wrapper
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
