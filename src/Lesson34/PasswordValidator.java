package Lesson34;
public class PasswordValidator {
    public static boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;
        String specialChars = "!%$@&";

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (specialChars.contains(String.valueOf(ch))) {
                hasSpecialChar = true;
            }
        }

        return hasDigit && hasLowerCase && hasUpperCase && hasSpecialChar;
    }

    public static void main(String[] args) {
        String password1 = "Abc123!";
        String password2 = "password123";
        String password3 = "12345678";

        System.out.println("Password 1 is valid: " + isPasswordValid(password1));
        System.out.println("Password 2 is valid: " + isPasswordValid(password2));
        System.out.println("Password 3 is valid: " + isPasswordValid(password3));
    }
}
