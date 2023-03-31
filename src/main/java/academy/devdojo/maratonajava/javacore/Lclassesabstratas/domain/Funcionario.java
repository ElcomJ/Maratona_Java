package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

/**
 * Aula_084 | Aula_085 | Aula_086<br />
 * Ao criar uma classe <b>abstract</b> ela vira um template, não sendo mais possível criar instâncias a partir dela.<br />
 * <b>final</b> é uma classe que não pode ser extendida | <b>abstract</b> é uma classe para ser extendida<br />
 * Métodos <b>abstratos</b> só podem existir dentro de classes <b>abstratas</b><br />
 * Porém uma classe abstrata pode ter métodos <b>abstratos</b> ou comuns.<br />
 */
public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    public abstract void calculaBonus();
}
