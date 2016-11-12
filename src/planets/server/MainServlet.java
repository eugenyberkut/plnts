package planets.server;

import planets.dao.StarDAO;
import planets.model.Star;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Eugeny on 25.10.2016.
 */
@WebServlet(name = "MainServlet", urlPatterns = {"*.html"})
public class MainServlet extends HttpServlet {
    @EJB
    StarDAO starDAO;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getServletPath().endsWith("/stars.html")) {
            request.setAttribute("stars", starDAO.findAll());
            request.getRequestDispatcher("/stars.jsp").forward(request,response);
        } else if (request.getServletPath().endsWith("/planets.html")) {
            String sid = request.getParameter("sid");
            if (sid != null) {
                Star star = starDAO.find(Integer.parseInt(sid));
                request.setAttribute("star", star);
                request.getRequestDispatcher("/planets.jsp").forward(request,response);
            }
        }
    }
}
