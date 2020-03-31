package by.epam.jwd.service;

public interface TeacherService extends UserService{
    void addTest(int testId, String name, String time, int categoryId) throws ServiceException;
    void changeTest(int testId, String newName, String newTime, int newCategoryId) throws ServiceException;
    void deleteTest(int testId) throws ServiceException;
    void formGroup(int groupId, String name) throws ServiceException;
}
