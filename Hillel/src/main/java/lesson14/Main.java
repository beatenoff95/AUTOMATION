package lesson14;

public class Main {
    public static void main(String[] args) {
        String password = "12345"; // Пароль для валідації

        try {
            PasswordValidator.validatePassword(password);
            System.out.println("Пароль успішно валідований.");
        } catch (WeakPasswordException e) {
            System.out.println("Ненадійний пароль: " + e.getMessage());
        }
    }
}
