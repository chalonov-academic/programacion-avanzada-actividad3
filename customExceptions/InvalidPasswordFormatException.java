package customExceptions;

public class InvalidPasswordFormatException extends Exception {
    private String password;

    public InvalidPasswordFormatException(String message, String password) {
        super(message);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}