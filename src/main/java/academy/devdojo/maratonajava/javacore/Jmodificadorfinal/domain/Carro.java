package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain;

/**
 * Aula_077 | Aula_078 | Aula_079<br />
 * Quando se usa <b>final</b> em um atributo, ele não pode ser alterado mais depois que um valor é associado.<br />
 * Uma constante precisa ser escrita toda em <b>MAISCULO_ASSIM</b> e separado por underscore se tiver mais de uma palavra.<br />
 * Ao usar uma variavel <b>final</b> você precisa inicializar ela, pois ela não aceita o valor default de uma variável primitiva<br />
 * Um método <b>final</b> não pode ser sobreescrito.<br />
 * Uma classe <b>final</b> não pode ser extendida.<br />
 */
public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime() {  // método final
        System.out.println(this.nome);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
