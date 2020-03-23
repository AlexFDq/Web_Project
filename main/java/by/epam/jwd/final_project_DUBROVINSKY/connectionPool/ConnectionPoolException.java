package by.epam.jwd.final_project_DUBROVINSKY.connectionPool;

import java.io.Serializable;

public class ConnectionPoolException extends Exception implements Serializable {
    private static final long serialVersionUID = 1L;

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
