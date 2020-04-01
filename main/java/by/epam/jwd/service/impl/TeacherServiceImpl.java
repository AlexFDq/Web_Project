package by.epam.jwd.service.impl;

import by.epam.jwd.dao.DAOException;
import by.epam.jwd.dao.DAOFactory;
import by.epam.jwd.dao.TeacherDAO;
import by.epam.jwd.service.ServiceException;
import by.epam.jwd.service.TeacherService;

public class TeacherServiceImpl extends UserServiceImpl implements TeacherService {
    private final String WRONG_TEST_ID = "Test id is less than zero";
    private final String WRONG_CATEGORY_ID = "Category id is less than zero";
    private final String WRONG_GROUP_ID = "Group id is less than zero";
    private final String WRONG_NAME = "Name equals null";
    private final String WRONG_TIME = "Time equals null";
    private final String WRONG_ADD_TEST_PROCEDURE = "Error during test adding procedure";
    private final String WRONG_CHANGE_TEST_PROCEDURE = "Error during test changing procedure";
    private final String WRONG_DELETE_TEST_PROCEDURE = "Error during test deleting procedure";
    private final String WRONG_FORM_GROUP_PROCEDURE = "Error during group forming procedure";

    @Override
    public void addTest(int testId, String name, String time, int categoryId) throws ServiceException {
        checkValues(testId, name, time, categoryId);

        try {
            getTeacherDAO().addTest(testId, name, time, categoryId);
        } catch (DAOException e) {
            throw new ServiceException(WRONG_ADD_TEST_PROCEDURE, e);
        }
    }

    @Override
    public void changeTest(int testId, String newName, String newTime, int newCategoryId) throws ServiceException {
        checkValues(testId, newName, newTime, newCategoryId);

        try {
            getTeacherDAO().changeTest(testId, newName, newTime, newCategoryId);
        } catch (DAOException e) {
            throw new ServiceException(WRONG_CHANGE_TEST_PROCEDURE, e);
        }
    }

    private void checkValues(int testId, String name, String time, int categoryId) throws ServiceException
    {
        if (testId <= 0) {
            throw new ServiceException(WRONG_TEST_ID);
        }
        if (name == null) {
            throw new ServiceException(WRONG_NAME);
        }
        if (time == null) {
            throw new ServiceException(WRONG_TIME);
        }
        if (categoryId <= 0) {
            throw new ServiceException(WRONG_CATEGORY_ID);
        }
    }

    @Override
    public void deleteTest(int testId) throws ServiceException {
        if (testId <= 0) {
            throw new ServiceException(WRONG_TEST_ID);
        }

        try {
            getTeacherDAO().deleteTest(testId);
        } catch (DAOException e) {
            throw new ServiceException(WRONG_DELETE_TEST_PROCEDURE, e);
        }
    }

    @Override
    public void formGroup(int groupId, String name) throws ServiceException {
        if (groupId <= 0) {
            throw new ServiceException(WRONG_GROUP_ID);
        }
        if (name == null) {
            throw new ServiceException(WRONG_NAME);
        }

        try {
            getTeacherDAO().formGroup(groupId, name);
        } catch (DAOException e) {
            throw new ServiceException(WRONG_FORM_GROUP_PROCEDURE, e);
        }
    }

    private TeacherDAO getTeacherDAO() {
        DAOFactory daoFactory = DAOFactory.getInstance();
        return daoFactory.getTeacherDAO();
    }
}
