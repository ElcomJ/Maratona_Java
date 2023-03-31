package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain;

/**
 * Aula_247 - <b>Design Patterns - Factory</b><br />
 */
public interface Currency {
    String getSymbol();
}

class Real implements Currency {
    @Override
    public String getSymbol() {
        return "R$";
    }
}

class UsDollar implements Currency {
    @Override
    public String getSymbol() {
        return "$";
    }
}
