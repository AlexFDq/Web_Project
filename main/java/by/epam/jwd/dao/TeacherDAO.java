package by.epam.jwd.dao;

import by.epam.jwd.bean.Group;
import by.epam.jwd.bean.Test;

public interface TeacherDAO extends UserDAO{
    void addTest(int testId, String name, String time, int categoryId) throws DAOException;
    Test changeTest(int testId, String newName, String newTime, int newCategoryId) throws DAOException;
    void deleteTest(int testId) throws DAOException;
    Group formGroup(int groupId, String name) throws DAOException;
}
