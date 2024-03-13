package lesson14;

public class PasswordValidator {
    public static void validatePassword(String password) throws WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("Пароль повинен містити принаймні 8 символів.");
        }

        if (!password.matches("[a-zA-Z0-9]+")) {
            throw new WeakPasswordException("Пароль має містити лише літери та цифри.");
        }
    }
}