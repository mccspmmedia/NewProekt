package Lesson28;
public class BankAccount implements PaymentSystem {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    @Override
    public void transferMoney(double amount, String recipient) {
        if (amount > 0 && amount <= balance) {
            // Реализация перевода средств
            balance -= amount;
            System.out.println("Перевод " + amount + " руб. на счет " + recipient + " выполнен.");
        } else {
            System.out.println("Ошибка: Недостаточно средств на счете.");
        }
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            // Реализация снятия средств
            balance -= amount;
            System.out.println("Снятие " + amount + " руб. выполнено.");
        } else {
            System.out.println("Ошибка: Недостаточно средств на счете.");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}

