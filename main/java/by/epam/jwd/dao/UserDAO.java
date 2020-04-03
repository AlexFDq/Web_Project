package by.epam.jwd.dao;

import by.epam.jwd.bean.User;
import by.epam.jwd.dao.connection_pool.ConnectionPoolException;

public interface UserDAO {
    void signIn(int id, String login, String password, String email, float progress, int roleId) throws DAOException, ConnectionPoolException;
    void singUp(User user) throws DAOException, ConnectionPoolException;
    void signOut(String login) throws DAOException;
}
