package by.epam.jwd.dao.impl;

import by.epam.jwd.bean.User;
import by.epam.jwd.dao.DAOException;
import by.epam.jwd.dao.UserDAO;

public class UserDAOImpl implements UserDAO {
    @Override
    public void signIn(int userId, String login, String password, String email) throws DAOException {

    }

    @Override
    public void singUp(User user) throws DAOException {

    }

    @Override
    public void signOut(String login) throws DAOException {

    }
}
