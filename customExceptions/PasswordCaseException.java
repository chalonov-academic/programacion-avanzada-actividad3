package customExceptions;

public class PasswordCaseException extends Exception {
    private String password;

    public PasswordCaseException(String message, String password) {
        super(message);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
