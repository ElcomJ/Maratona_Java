package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain;

/**
 * Aula_246 - <b>Design Patterns - Builder</b><br />
 * <b>Design Patterns</b> são padrões feitos para resolver problemas comuns do dia a dia<br />
 * A classe <b>PersonBuilder</b> usa o conceito da classe interna ter acesso a tudo externo<br />
 * Sempre que adicinamos valor a um atributo  do builder ,ele retorna a this<br />
 *
 */
public class Person {
    private final String firstName;
    private final String lastName;
    private final String username;
    private final String email;

    private Person(String firstName, String lastName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class PersonBuilder { // Builder Design Pattern Here
        private String firstName;
        private String lastName;
        private String username;
        private String email;

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder username(String username) {
            this.username = username;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(firstName, lastName, username, email);
        }
    }

    public String getFirstName() {
        return firstName;
    }
}
