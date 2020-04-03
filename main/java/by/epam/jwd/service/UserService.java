package by.epam.jwd.service;

import by.epam.jwd.bean.User;

public interface UserService {
    void signIn(String login, String password) throws ServiceException;
    void singUp(User user) throws ServiceException;
    void signOut(String login) throws ServiceException;
}
