package by.epam.jwd.dao;

public class DAOException extends Exception {
    private final static long serialVersionUID = 1L;

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
