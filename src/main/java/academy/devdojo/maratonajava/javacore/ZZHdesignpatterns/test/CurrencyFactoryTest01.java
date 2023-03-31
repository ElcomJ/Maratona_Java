package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.Country;
import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.Currency;
import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.CurrencyFactory;

/**
 * Aula_247 - <b>Design Patterns - Factory</b><br />
 * <b>Factory</b> é um Design Pattern utilizada para realizar o desacoplamento facilitando a manutenção<br />
 */
public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
