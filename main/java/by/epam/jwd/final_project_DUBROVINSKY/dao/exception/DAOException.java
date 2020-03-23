package by.epam.jwd.final_project_DUBROVINSKY.dao.exception;

import java.io.Serializable;

public class DAOException extends Exception implements Serializable {
    private final static long serialVersionUID = 2L;

    public DAOException() {
        super();
    }

    public DAOException(String message) {
        super(message);
    }

    public DAOException(Exception exception) {
        super(exception);
    }

    public DAOException(String message, Exception exception) {
        super(message, exception);
    }
}
