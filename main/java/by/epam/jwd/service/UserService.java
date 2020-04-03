package by.epam.jwd.service;

import by.epam.jwd.bean.User;

public interface UserService {
    void signIn(int id, String login, String password, String email, float progress, int roleId) throws ServiceException;
    void singUp(User user) throws ServiceException;
    void signOut(String login) throws ServiceException;
}
