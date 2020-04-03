package by.epam.jwd.dao.impl;

import by.epam.jwd.bean.User;
import by.epam.jwd.dao.DAOException;
import by.epam.jwd.dao.UserDAO;
import by.epam.jwd.dao.connection_pool.ConnectionPool;
import by.epam.jwd.dao.connection_pool.ConnectionPoolException;
import by.epam.jwd.dao.connection_pool.ConnectionPoolFactory;

import java.sql.*;

public class UserDAOImpl implements UserDAO {
    private static final String INSERT_USER = "INSERT INTO users (id, login, password, email, progress, Roles_id) VALUES (?,?,?,?,?,?)";
    private static final String CONNECTION_POOL_EXCEPTION = "Connection pool exception in DAO layer";
    private static final String SQL_EXCEPTION = "SQL exception in DAO layer";

    private ConnectionPoolFactory poolFactory = ConnectionPoolFactory.getInstance();
    private ConnectionPool connectionPool = poolFactory.getConnectionPool();

    @Override
    public void signIn(int id, String login, String password, String email, float progress, int roleId) throws DAOException, ConnectionPoolException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet generatedKeys = null;

        try {
            connection = connectionPool.takeConnection();
            preparedStatement = connection.prepareStatement(INSERT_USER, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, login);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, email);
            preparedStatement.setFloat(5, progress);
            preparedStatement.setInt(6, roleId);

            preparedStatement.executeUpdate();

        } catch (ConnectionPoolException e) {
            throw new ConnectionPoolException(CONNECTION_POOL_EXCEPTION, e);
        } catch (SQLException e) {
            throw new DAOException(SQL_EXCEPTION, e);
        } finally {
            connectionPool.closeConnection(connection, preparedStatement, generatedKeys);
        }
    }

    @Override
    public void singUp(User user) throws DAOException, ConnectionPoolException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet generatedKeys = null;

        try {
            connection = connectionPool.takeConnection();
            preparedStatement = connection.prepareStatement(INSERT_USER, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2, user.getLogin());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setFloat(5, user.getProgress());
            preparedStatement.setInt(6, user.getRoleId());

            preparedStatement.executeUpdate();

        } catch (ConnectionPoolException e) {
            throw new ConnectionPoolException(CONNECTION_POOL_EXCEPTION, e);
        } catch (SQLException e) {
            throw new DAOException(SQL_EXCEPTION, e);
        } finally {
            connectionPool.closeConnection(connection, preparedStatement, generatedKeys);
        }
    }

    @Override
    public void signOut(String login) throws DAOException {

    }
}
