package Homework13;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import Homework13.Exception.WrongLoginException;
import Homework13.Exception.WrongPasswordException;

public class UserValidator {

    // Регулярное выражение для проверки login
    private static final Pattern LOGIN_PATTERN = Pattern.compile("^[\\S]{1,19}$");

    // Регулярное выражение для проверки password
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*\\d)[\\S]{1,19}$");

    // Статический метод для проверки login и password
    public static boolean validateCredentials(String login, String password, String confirmPassword)
            throws Exception {
        // Проверка login
        Matcher matcher = LOGIN_PATTERN.matcher(login);
        if (!matcher.matches()) {
            throw new WrongLoginException("Login must be less than 20 characters and should not contain spaces.");
        }

        // Проверка password
        matcher = PASSWORD_PATTERN.matcher(password);
        if (!matcher.matches()) {
            throw new WrongPasswordException("Password must be less than 20 characters," +
                    " should not contain spaces, and must contain at least one digit.");
        }

        // Проверка соответствия password и confirmPassword
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords do not match.");
        }

        return true;
    }
    // Main метод для демонстрации работы
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        boolean isValid = false;
        try {
            isValid = validateCredentials("user123", "Password1", "Password1");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Credentials are valid: " + isValid);
        // В этом примере finally блок не будет вызван, потому что метод main завершится успешно
    }
}