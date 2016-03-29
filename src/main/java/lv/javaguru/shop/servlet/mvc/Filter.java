package lv.javaguru.shop.servlet.mvc;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by maris on 3/29/16.
 */
public interface Filter {
    void init(FilterConfig filterConfig) throws ServletException;

    void doFilter(ServletRequest request,
                  ServletResponse response,
                  FilterChain filterChain) throws IOException, ServletException;


    void destroy();
}
