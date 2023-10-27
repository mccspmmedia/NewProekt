package Lesson35;
public class Account {
    private String password;

    public boolean setPassword(String newPassword) {
        if (newPassword != null && newPassword.length() >= 8) {
            this.password = newPassword;
            return true;
        } else {
            return false;
        }
    }

    public String getPassword() {
        return password;
    }
}
