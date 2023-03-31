package academy.devdojo.maratonajava.javacore.ZZKjunit.service;

import academy.devdojo.maratonajava.javacore.ZZKjunit.domain.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Aula_280 - <b>Testes Unitários com jUnit</b><br />
 * Aula_281 - <b>Testes Unitários com jUnit</b><br />
 * <b>@BeforeEach</b> é um código que é executado antes de todos os testes<br />
 * Se criarmos instancias das classes fora do <b>@BeforeEarch</b> o que for alterado nos testes, iram refletir em todas as outras classes
 * pois você irá estar alterando um atributo de classe<br />
 * Quando a classe não possui um atributo para ser passado, pode instanciar ela fora do <b>@BeforeEach</b>, porém não é uma boa prática<br />
 *
 */

class PersonServiceTest {

    private Person adult;
    private Person  notAdult;
    private PersonService personService;

    @BeforeEach
    void setUp() {
        adult = new Person(18);
        notAdult = new Person(15);
        personService = new PersonService();
    }

    @Test
    @DisplayName("A person should be not adult when age is lower than 18")
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        Assertions.assertFalse(personService.isAdult(notAdult));
    }

    @Test
    @DisplayName("A person should be adult when age is greater or equal than 18")
    void isAdult_ReturnTrue_WhenAgeIsGreaterOrEqualsThan18() {
        Assertions.assertTrue(personService.isAdult(adult));
    }

    @Test
    @DisplayName("Should throw NullPointerException with message when person is null")
    void isAdult_ThrowException_WhenPersonIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> personService.isAdult(null), "Person can't be null");
    }

    @Test
    @DisplayName("Should return list with only adults")
    void filterRemovingNotAdult_ReturnListWithAdultOnly_WhenListOfPersonWithAdultIsPassed() {
        Person person1 = new Person(17);
        Person person2 = new Person(18);
        Person person3 = new Person(21);
        List<Person> personList = List.of(person1, person2, person3);
        Assertions.assertEquals(2, personService.filterRemovingNotAdult(personList).size());
    }
}