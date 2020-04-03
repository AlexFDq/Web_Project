package by.epam.jwd.controller.command.user_impl;

import by.epam.jwd.bean.User;
import by.epam.jwd.controller.command.Command;
import by.epam.jwd.service.ServiceException;
import by.epam.jwd.service.ServiceFactory;
import by.epam.jwd.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ResourceBundle;

public class SignIn implements Command {
    private final String PARAM_ID = "id";
    private final String PARAM_LOGIN = "login";
    private final String PARAM_PASSWORD = "password";
    private final String PARAM_EMAIL = "email";

    private final String BUNDLE_NAME = "config";

    private final String ERROR_PARAM = "error";
    private final String ERROR_PATH = "error_path";
    private final String INDEX_PAGE = "index_page";
    private final String SERVLET_EXCEPTION_MESSAGE = "servlet_exception_message";

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        int userId = Integer.parseInt(request.getParameter(PARAM_ID));
        String login = request.getParameter(PARAM_LOGIN);
        String password = request.getParameter(PARAM_PASSWORD);
        String email = request.getParameter(PARAM_EMAIL);

        User user = new User();
        user.setId(userId);
        user.setLogin(login);
        user.setPassword(password);
        user.setEmail(email);

        UserService userService = ServiceFactory.getInstance().getUserService();
        ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME);

        String page = resourceBundle.getString(INDEX_PAGE);

        try {
            userService.signIn(login, password);
        } catch (ServiceException e) {
            request.setAttribute(ERROR_PARAM, resourceBundle.getString(SERVLET_EXCEPTION_MESSAGE));
            page = resourceBundle.getString(ERROR_PATH);
        }

        return page;
    }
}