package by.epam.jwd.service;

import by.epam.jwd.bean.User;

public interface UserService {
    void signIn(int userId, String login, String password, String email) throws ServiceException;
    void singUp(User user) throws ServiceException;
    void signOut(String login) throws ServiceException;
}
