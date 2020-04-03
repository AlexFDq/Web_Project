package by.epam.jwd.dao;

public class DAOException extends Exception {
    private static final long serialVersionUID = 4688857996903035614L;

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
