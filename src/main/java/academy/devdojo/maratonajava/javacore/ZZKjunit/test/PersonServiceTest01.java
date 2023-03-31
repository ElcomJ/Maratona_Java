package academy.devdojo.maratonajava.javacore.ZZKjunit.test;

import academy.devdojo.maratonajava.javacore.ZZKjunit.domain.Person;
import academy.devdojo.maratonajava.javacore.ZZKjunit.service.PersonService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

/**
 * Aula_280 - <b>Testes Unitários com jUnit</b><br />
 */

@Log4j2
public class PersonServiceTest01 {
    public static void main(String[] args) {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        log.info("Is Adult? '{}'", personService.isAdult(person));
    }
}
