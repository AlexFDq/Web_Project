package by.epam.jwd.service;

public interface StudentService extends UserService {
    int passTest(int testId) throws ServiceException;
    void joinGroup(int groupId) throws ServiceException;
}
