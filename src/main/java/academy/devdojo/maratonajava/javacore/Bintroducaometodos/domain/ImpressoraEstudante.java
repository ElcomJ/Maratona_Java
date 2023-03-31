package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

/**
 * Orientação Objetos - Métodos pt 06 - Parâmetros tipo referência | Aula_049 | Aula_050
 */
public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        // Quando passamos parametros como referencia estamos passando a própria referencia do objeto na memória
        System.out.println("------------------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        estudante.nome = "Gohan";
    }
}
