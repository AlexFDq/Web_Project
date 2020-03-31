package by.epam.jwd.dao;

public interface StudentDAO extends UserDAO {
    void passTest(int testId) throws DAOException;
    void joinGroup(int groupId) throws DAOException;
}
