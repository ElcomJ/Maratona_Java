package academy.devdojo.maratonajava.javacore.ZZKjunit.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Aula_284 - <b>Pattern Matching for instanceof</b><br />
 * Esse <b>Pattern Matching</b> faz com que possamos passar uma variavel, onde caso o instanceof der true, retorna o objeto já com o Cast<br />
 */

class DeveloperTest {

    @Test
    public void instanceOf_ExecutesChildClassMethod_WhenObjectIsChildType() {
        Employee employeeDeveloper = new Developer("1", "Java");
        if (employeeDeveloper instanceof Developer) {
            assertEquals("Java", ((Developer) employeeDeveloper).getMainLanguage());
        }

        if (employeeDeveloper instanceof Developer developer) { // Pattern Matching for instanceof here
            assertEquals("Java", developer.getMainLanguage());
        }
    }
}