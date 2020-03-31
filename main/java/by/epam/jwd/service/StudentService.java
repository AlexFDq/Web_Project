package by.epam.jwd.service;

public interface StudentService extends UserService {
    void passTest(int testId) throws ServiceException;
    void joinGroup(int groupId) throws ServiceException;
}
