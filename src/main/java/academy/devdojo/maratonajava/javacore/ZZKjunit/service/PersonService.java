package academy.devdojo.maratonajava.javacore.ZZKjunit.service;

import academy.devdojo.maratonajava.javacore.ZZKjunit.domain.Person;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Aula_280 - <b>Testes Unitários com jUnit</b><br />
 * Os Testes Unitarios são usados para verificar se um novo código inserido irá afetar outros pedaços de código.<br />
 * Os testes são utilizados para testar as camadas de negócios<br />
 * Quando criamos um novo teste, esperamos que a saida seja false quando testamos a função<br />
 */
public class PersonService {

    public boolean isAdult(Person person) {
//        Objects.requireNonNull(person, "Person can't be null");
        if (person == null) {
            throw new IllegalArgumentException();
        }
        return person.getAge() >= 18;
    }

    public List<Person> filterRemovingNotAdult(List<Person> personList) {
        return personList.stream()
                .filter(this::isAdult)
                .collect(Collectors.toList());
    }
}
