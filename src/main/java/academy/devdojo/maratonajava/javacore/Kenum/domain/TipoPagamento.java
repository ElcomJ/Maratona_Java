package academy.devdojo.maratonajava.javacore.Kenum.domain;

/**
 * Aula_082<br />
 * Um <b>Método Abstrato</b> não pode ter corpo, ele foi criado somente para ser sobreescrito.<br />
 */
public enum TipoPagamento {
    DEBITO { // Sobreescrita do método calcularDesconto
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double valor);
}