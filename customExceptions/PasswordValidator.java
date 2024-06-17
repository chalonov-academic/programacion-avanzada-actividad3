package customExceptions;

public class PasswordValidator {
    public static void validatePassword(String password) throws PasswordLengthException, InvalidPasswordFormatException, PasswordCaseException {
        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;

        if (password.length() <= 8) {
            throw new PasswordLengthException("Error: La contraseña debe tener más de 8 caracteres", password);
        }

        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
                if (Character.isLowerCase(c)) {
                    hasLowerCase = true;
                } else if (Character.isUpperCase(c)) {
                    hasUpperCase = true;
                }
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        if (!hasLetter || !hasDigit) {
            throw new InvalidPasswordFormatException("Error: La contraseña debe contener al menos una letra y un número", password);
        }

        if (!hasLowerCase || !hasUpperCase) {
            throw new PasswordCaseException("Error: La contraseña debe contener al menos una letra minúscula y una mayúscula", password);
        }

        System.out.println("Contraseña válida");
    }
}