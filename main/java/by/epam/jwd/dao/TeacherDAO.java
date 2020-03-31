package by.epam.jwd.dao;

public interface TeacherDAO extends UserDAO{
    void addTest(int testId, String name, String time, int categoryId) throws DAOException;
    void changeTest(int testId, String newName, String newTime, int newCategoryId) throws DAOException;
    void deleteTest(int testId) throws DAOException;
    void formGroup(int groupId, String name) throws DAOException;
}
