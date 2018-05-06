package app.servlets;

import app.model.GroupModel;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListGroupServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GroupModel model = GroupModel.getInstance();
        List<String> names = model.listGroups();
        req.setAttribute("groupNames", names);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/listgroups.jsp");
        requestDispatcher.forward(req, resp);
    }
}
