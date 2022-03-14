package org.gopinnath;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GreetingServlet", urlPatterns = "/servlet/hello")
public class GreetingServlet extends HttpServlet {


    @Inject
    private GreetingService service;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String greeting = "Hello World!!";
        if(request.getParameter("name") != null) {
            greeting = service.greet(request.getParameter("name"));
        }
        response.setStatus(200);
        response.addHeader("Content-Type", "text/plain");
        response.getWriter().write(greeting);
    }
}