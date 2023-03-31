package academy.devdojo.maratonajava.javacore.ZZFthreads.domain;

/**
 * Aula_224 - <b>Sincronismo de Thread</b><br />
 *
 */
public class Account {
    private int balance = 50;

    public void withdrawal(int amount) {
        this.balance = this.balance - amount;
    }

    public int getBalance() {
        return balance;
    }
}
