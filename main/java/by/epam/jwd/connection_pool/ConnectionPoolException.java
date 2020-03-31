package by.epam.jwd.connection_pool;

public class ConnectionPoolException extends Exception {
    private static final long serialVersionUID = 8L;

    public ConnectionPoolException() {
        super();
    }

    public ConnectionPoolException(String message) {
        super(message);
    }

    public ConnectionPoolException(Exception exception) {
        super(exception);
    }

    public ConnectionPoolException(String message, Exception exception){
        super(message, exception);
    }
}
