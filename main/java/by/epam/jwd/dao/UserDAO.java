package by.epam.jwd.dao;

import by.epam.jwd.bean.User;

public interface UserDAO {
    void signIn(String login, String password) throws DAOException;
    void singUp(User user) throws DAOException;
    void signOut(String login) throws DAOException;
}
