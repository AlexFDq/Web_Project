package by.epam.jwd.service;

import by.epam.jwd.service.impl.StudentServiceImpl;
import by.epam.jwd.service.impl.TeacherServiceImpl;
import by.epam.jwd.service.impl.UserServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final UserService userService = new UserServiceImpl();
    private final StudentService studentService = new StudentServiceImpl();
    private final TeacherService teacherService = new TeacherServiceImpl();

    private ServiceFactory() {

    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    public UserService getUserService() {
        return userService;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public TeacherService getTeacherService() {
        return teacherService;
    }
}
