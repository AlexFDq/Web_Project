package by.epam.jwd.service;

import by.epam.jwd.bean.Group;
import by.epam.jwd.bean.Test;

public interface TeacherService extends UserService{
    void addTest(int testId, String name, String time, int categoryId) throws ServiceException;
    Test changeTest(int testId, String newName, String newTime, int newCategoryId) throws ServiceException;
    void deleteTest(int testId) throws ServiceException;
    Group formGroup(int groupId, String name) throws ServiceException;
}
