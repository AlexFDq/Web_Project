package by.epam.jwd.service.impl;

import by.epam.jwd.dao.DAOException;
import by.epam.jwd.dao.DAOFactory;
import by.epam.jwd.dao.StudentDAO;
import by.epam.jwd.service.ServiceException;
import by.epam.jwd.service.StudentService;

public class StudentServiceImpl extends UserServiceImpl implements StudentService {
    private final String WRONG_TEST_ID = "Test id is less than zero";
    private final String WRONG_GROUP_ID = "Group id is less than zero";
    private final String WRONG_PASS_TEST_PROCEDURE = "Error during test passing procedure";
    private final String WRONG_JOIN_GROUP_PROCEDURE = "Error during group joining procedure";

    @Override
    public void passTest(int testId) throws ServiceException {
        if (testId <= 0) {
            throw new ServiceException(WRONG_TEST_ID);
        }

        try {
            getStudentDAO().passTest(testId);
        } catch (DAOException e) {
            throw new ServiceException(WRONG_PASS_TEST_PROCEDURE);
        }

    }

    @Override
    public void joinGroup(int groupId) throws ServiceException {
        if (groupId <= 0) {
            throw new ServiceException(WRONG_GROUP_ID);
        }

        try {
            getStudentDAO().joinGroup(groupId);
        } catch (DAOException e) {
            throw new ServiceException(WRONG_JOIN_GROUP_PROCEDURE, e);
        }
    }

    private StudentDAO getStudentDAO() {
        DAOFactory daoFactory = DAOFactory.getInstance();
        return daoFactory.getStudentDAO();
    }
}
