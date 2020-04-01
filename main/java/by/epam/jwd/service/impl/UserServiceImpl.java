package by.epam.jwd.service.impl;

import by.epam.jwd.bean.User;
import by.epam.jwd.dao.DAOException;
import by.epam.jwd.dao.DAOFactory;
import by.epam.jwd.dao.UserDAO;
import by.epam.jwd.service.ServiceException;
import by.epam.jwd.service.UserService;

public class UserServiceImpl implements UserService {
    private final String WRONG_USER_ID = "User id is less than zero";
    private final String WRONG_LOGIN = "Login is incorrect";
    private final String WRONG_PASSWORD = "Password is incorrect";
    private final String WRONG_EMAIL = "Email is incorrect";
    private final String WRONG_SIGN_IN_PROCEDURE = "Error during sign in procedure";
    private final String WRONG_SIGN_UP_PROCEDURE = "Error during sign up procedure";
    private final String WRONG_SIGN_OUT_PROCEDURE = "Error during sign out procedure";

    @Override
    public void signIn(int userId, String login, String password, String email) throws ServiceException {
        if (userId <= 0) {
            throw new ServiceException(WRONG_USER_ID);
        }
        if (login == null) {
            throw new ServiceException(WRONG_LOGIN);
        }
        if (password == null) {
            throw new ServiceException(WRONG_PASSWORD);
        }
        if (email == null) {
            throw new ServiceException(WRONG_EMAIL);
        }

        try {
            getUserDAO().signIn(userId, login, password, email);
        } catch (DAOException e) {
            throw new ServiceException(WRONG_SIGN_IN_PROCEDURE, e);
        }
    }

    @Override
    public void singUp(User user) throws ServiceException {
        String login = user.getLogin();
        String password = user.getPassword();
        String email = user.getEmail();

        if (login == null || login.isEmpty()) {
            throw new ServiceException(WRONG_LOGIN);
        }
        if (password == null || password.isEmpty()) {
            throw new ServiceException(WRONG_PASSWORD);
        }
        if (email == null || email.isEmpty()) {
            throw new ServiceException(WRONG_EMAIL);
        }

        try {
            getUserDAO().singUp(user);
        } catch (DAOException e) {
            throw new ServiceException(WRONG_SIGN_UP_PROCEDURE, e);
        }
    }

    @Override
    public void signOut(String login) throws ServiceException {
        if (login == null || login.isEmpty()) {
            throw new ServiceException(WRONG_LOGIN);
        }

        try {
            getUserDAO().signOut(login);
        } catch (DAOException e) {
            throw new ServiceException(WRONG_SIGN_OUT_PROCEDURE, e);
        }
    }

    private UserDAO getUserDAO() {
        DAOFactory daoFactory = DAOFactory.getInstance();
        return daoFactory.getUserDAO();
    }
}
