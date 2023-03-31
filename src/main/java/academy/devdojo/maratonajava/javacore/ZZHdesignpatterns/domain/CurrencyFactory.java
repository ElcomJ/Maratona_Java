package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain;

/**
 * Aula_247 - <b>Design Patterns - Factory</b><br />
 */
public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        switch (country) {
            case BRAZIL:
                return new Real();
            case USA:
                return new UsDollar();
            default:
                throw new IllegalArgumentException("No currency found for this country");
        }
    }
}
