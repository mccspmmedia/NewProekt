package Lesson35;
public class AccountTest {
    public static void main(String[] args) {
        testValidPassword();
        testWeakPassword();
        testEmptyPassword();
        testNullPassword();
    }

    public static void testValidPassword() {
        Account account = new Account(); // Замените "Account" на имя вашего класса
        String validPassword = "StrongPassword123";
        if (account.setPassword(validPassword)) {
            System.out.println("testValidPassword: Passed");
        } else {
            System.out.println("testValidPassword: Failed");
        }
    }

    public static void testWeakPassword() {
        Account account = new Account(); // Замените "Account" на имя вашего класса
        String weakPassword = "weak";
        if (!account.setPassword(weakPassword)) {
            System.out.println("testWeakPassword: Passed");
        } else {
            System.out.println("testWeakPassword: Failed");
        }
    }

    public static void testEmptyPassword() {
        Account account = new Account(); // Замените "Account" на имя вашего класса
        String emptyPassword = "";
        if (!account.setPassword(emptyPassword)) {
            System.out.println("testEmptyPassword: Passed");
        } else {
            System.out.println("testEmptyPassword: Failed");
        }
    }

    public static void testNullPassword() {
        Account account = new Account(); // Замените "Account" на имя вашего класса
        String nullPassword = null;
        if (!account.setPassword(nullPassword)) {
            System.out.println("testNullPassword: Passed");
        } else {
            System.out.println("testNullPassword: Failed");
        }
    }
}
