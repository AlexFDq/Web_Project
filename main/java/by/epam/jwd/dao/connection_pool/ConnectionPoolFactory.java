package by.epam.jwd.dao.connection_pool;

public final class ConnectionPoolFactory {
    private static final ConnectionPoolFactory instance = new ConnectionPoolFactory();

    private final ConnectionPool connectionPool = new ConnectionPool();

    private ConnectionPoolFactory() {

    }

    public static ConnectionPoolFactory getInstance() {
        return instance;
    }

    public ConnectionPool getConnectionPool() {
        return connectionPool;
    }
}
