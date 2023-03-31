package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

/**
 * Orientação Objetos - Métodos pt 06 - Parâmetros tipo referência | Aula_049 | Aula_051
 */
public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime() { //Quando esta dentro do objeto não precisa de parametro
        System.out.println("---------------------------------");
        System.out.println(this.nome); // this se refere as variaveis dessa classe
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
