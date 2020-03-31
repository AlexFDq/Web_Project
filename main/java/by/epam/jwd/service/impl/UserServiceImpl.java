package by.epam.jwd.service.impl;

import by.epam.jwd.bean.User;
import by.epam.jwd.dao.DAOException;
import by.epam.jwd.dao.DAOFactory;
import by.epam.jwd.dao.UserDAO;
import by.epam.jwd.service.ServiceException;
import by.epam.jwd.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void signIn(String login, String password, String email) throws ServiceException {
        if (login == null) {
            throw new ServiceException("Login equals null");
        }
        if (password == null) {
            throw new ServiceException("Password equals null");
        }
        if (email == null) {
            throw new ServiceException("Email equals null");
        }

        try {
            DAOFactory daoFactory = DAOFactory.getInstance();
            UserDAO userDAO = daoFactory.getUserDAO();
            userDAO.signIn(login, password, email);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public void singUp(User user) throws ServiceException {
        String login = user.getLogin();
        String password = user.getPassword();
        String email = user.getEmail();
        if (login == null || login.isEmpty()) {
            throw new ServiceException("Login is incorrect");
        }
        if (password == null || password.isEmpty()) {
            throw new ServiceException("Password is incorrect");
        }
        if (email == null || email.isEmpty()) {
            throw new ServiceException("Email is incorrect");
        }

        try {
            DAOFactory daoFactory = DAOFactory.getInstance();
            UserDAO userDAO = daoFactory.getUserDAO();
            userDAO.singUp(user);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public void signOut(String login) throws ServiceException {

    }
}
