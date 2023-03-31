package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

/**
 * Aula_084 | Aula_085 | Aula_086
 */
public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario * 1.10;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
