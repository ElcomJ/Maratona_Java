package academy.devdojo.maratonajava.javacore.Hheranca.domain;

/**
 * Aula_071 | Aula_072 | Aula_073 | Aula_074<br />
 * Herança faz uma classe extender os <b>atributos e métodos</b> de uma classe base.<br />
 * Herança faz com que a sua classe fique extremamente acoplada<br />
 * Herança <b>NÃO</b> pode extender mais de <b>UMA</b> classe.<br />
 * Overwrite faz com que possamos sobreescrever um método da classe Pai na classe que extende ela.
 */
public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco estático de funcionario");
    }

    {
        System.out.println("Dentro do bloco inicialização de funcionario 1");
    }

    {
        System.out.println("Dentro do bloco inicialização de funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome); // Chama o construtor da Classe Pai (Pessoa).
        System.out.println("Dentro do construtor de funcionário");
    }

    public void imprime() {
        super.imprime();  // Super faz com que tenhamos acesso aos atributos e métodos do objeto da classe Pai.
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
