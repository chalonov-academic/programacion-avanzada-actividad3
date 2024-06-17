package customExceptions;

public class PasswordLengthException extends Exception {
    private String password;

    public PasswordLengthException(String message, String password) {
        super(message);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}