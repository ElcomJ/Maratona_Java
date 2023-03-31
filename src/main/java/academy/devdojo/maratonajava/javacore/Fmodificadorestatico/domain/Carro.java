package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

/**
 * Aula_061 | Aula_062
 * <br /><br />
 * - Um atributo estatico não precisa de uma instancia para ser acessado.<br />
 * - Quando um atributo static de classe é alterado, ele altera em todas as intancias daquela classe.<br />
 * - Um atributo static vira uma atributo da classe e não do objeto.<br />
 * - Um método static só deve ser usado quando ele não for acessar a nenhum atributo da instancia da classe.<br />
 * - Ao criar um atributo <b>static</b> ele irá existir antes do <b>Objeto</b>.
 */
public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250; // Static faz o atributo pertencer a classe

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() { // Método de Instância
        System.out.println("----------------------------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade máxima " + this.velocidadeMaxima);
        System.out.println("Velocidade limite " + Carro.velocidadeLimite); // Acessando através da classe
    }

    public static void setVelocidadeLimite(double velocidadeLimite) { // Método da Classe
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
