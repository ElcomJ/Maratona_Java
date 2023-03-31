package academy.devdojo.maratonajava.javacore.ZZJcrud.domain;

import lombok.Builder;
import lombok.Value;

/**
 * Aula_275 - <b>JDBC - CRUD - findByName and findAll</b><br />
 */

@Value
@Builder
public class Producer {
    Integer id;
    String name;
}
