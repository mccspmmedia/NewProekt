package Lesson28.Task0;
public class Main {
    public static void main(String[] args) {
        PaymentSystem bankAccount = new BankAccount(1000.0);
        PaymentSystem electronicWallet = new ElectronicWallet(500.0);

        bankAccount.transferMoney(200.0, "12345");
        System.out.println("Баланс банковского счета: " + bankAccount.checkBalance());

        electronicWallet.withdrawMoney(100.0);
        System.out.println("Баланс электронного кошелька: " + electronicWallet.checkBalance());
    }
}
