package by.epam.jwd.dao.impl;

import by.epam.jwd.dao.DAOException;
import by.epam.jwd.dao.StudentDAO;

public class StudentDAOImpl extends UserDAOImpl implements StudentDAO {
    @Override
    public int passTest(int testId) throws DAOException {
        return 0;
    }

    @Override
    public void joinGroup(int groupId) throws DAOException {

    }
}
