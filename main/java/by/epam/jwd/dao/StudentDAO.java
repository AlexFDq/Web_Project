package by.epam.jwd.dao;

public interface StudentDAO extends UserDAO {
    int passTest(int testId) throws DAOException;
    void joinGroup(int groupId) throws DAOException;
}
