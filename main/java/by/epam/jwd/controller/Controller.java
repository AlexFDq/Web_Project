package by.epam.jwd.controller;

import by.epam.jwd.controller.command.Command;
import by.epam.jwd.controller.command.CommandProvider;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ResourceBundle;

@WebServlet(urlPatterns = "/controller", name = "Controller")
public class Controller extends HttpServlet {
    private static final long serialVersionUID = -8001521927401134913L;

    private final CommandProvider provider = new CommandProvider();

    private final String BUNDLE_NAME = "config";
    private final String ERROR_ATTRIBUTE = "error";
    private final String SERVLET_EXCEPTION_MESSAGE = "servlet_exception_message";
    private final String IO_EXCEPTION_MESSAGE = "input_output_exception_message";
    private final String ERROR_PAGE_PATH = "error_page_path";
    private final String INDEX_PAGE = "index_page";

    public Controller() {
        super();
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html");

        String page;
        ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME);

        try {
            Command command = provider.getCommand(request);
            page = command.execute(request, response);
        } catch (ServletException e) {
            request.setAttribute(ERROR_ATTRIBUTE, resourceBundle.getObject(SERVLET_EXCEPTION_MESSAGE));
            page = resourceBundle.getString(ERROR_PAGE_PATH);
        } catch (IOException e) {
            request.setAttribute(ERROR_ATTRIBUTE, resourceBundle.getObject(IO_EXCEPTION_MESSAGE));
            page = resourceBundle.getString(ERROR_PAGE_PATH);
        }

        if (page != null) {
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                request.setAttribute(ERROR_ATTRIBUTE, resourceBundle.getObject(SERVLET_EXCEPTION_MESSAGE));
            } catch (IOException e) {
                request.setAttribute(ERROR_ATTRIBUTE, resourceBundle.getObject(IO_EXCEPTION_MESSAGE));
            }
        } else {
            page = resourceBundle.getString(INDEX_PAGE);
            response.sendRedirect(request.getContextPath() + page);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}