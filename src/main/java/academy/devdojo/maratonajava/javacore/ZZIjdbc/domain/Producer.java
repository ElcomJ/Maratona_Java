package academy.devdojo.maratonajava.javacore.ZZIjdbc.domain;

import lombok.Builder;
import lombok.Value;

/**
 * Aula_257 - <b>JDBC</b><br />
 * Aula_258 - <b>Lombok e Log4J2</b><br />
 * <b>Lombok</b> diminui bastante linhas de códigos, colocando tudo dentro do .class diretamente<br />
 * Nunca se usa o <b>System.out.println</b> em ambiente comporativo, utilizamos o <b>Log</b> para ver direto no terminal as informações<br />
 * A performance do <b>System.out.println</b> além de prejudicar a performance dificultado bastante quando da problema nele<br />
 * <b>@Value</b> transforma todos os dados em dados imutaveis<br />
 * <b>@Builder</b> gera um builder<br />
 */

@Value
@Builder
public class Producer {
    Integer id;
    String name;
}
