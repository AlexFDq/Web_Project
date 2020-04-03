package by.epam.jwd.controller;

import javax.servlet.*;
import java.io.IOException;

public class StringEncodingFilter implements Filter {
    private final String ENCODING = "encoding";
    private String defaultEncoding = "utf-8";

    @Override
    public void init(FilterConfig config) {
        String encoding = config.getInitParameter(ENCODING);
        if (encoding != null) {
            defaultEncoding = encoding;
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        request.setCharacterEncoding(defaultEncoding);
        response.setCharacterEncoding(defaultEncoding);
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
