package by.epam.jwd.dao;

import by.epam.jwd.dao.impl.StudentDAOImpl;
import by.epam.jwd.dao.impl.TeacherDAOImpl;
import by.epam.jwd.dao.impl.UserDAOImpl;

public class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final UserDAO userDAO = new UserDAOImpl();
    private final StudentDAO studentDAO = new StudentDAOImpl();
    private final TeacherDAO teacherDAO = new TeacherDAOImpl();

    private DAOFactory() {

    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public StudentDAO getStudentDAO() {
        return studentDAO;
    }

    public TeacherDAO getTeacherDAO() {
        return teacherDAO;
    }
}
