package Lesson28.Task0;
public interface PaymentSystem {
    void transferMoney(double amount, String recipient);
    void withdrawMoney(double amount);
    double checkBalance();
}
