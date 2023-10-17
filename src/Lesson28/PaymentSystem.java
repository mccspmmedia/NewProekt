package Lesson28;
public interface PaymentSystem {
    void transferMoney(double amount, String recipient);
    void withdrawMoney(double amount);
    double checkBalance();
}
