package app.servlets;

import app.entities.Group;
import app.model.GroupModel;
import app.model.StudentModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ViewGroupServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/viewgroup.jsp");
        requestDispatcher.forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String groupname = req.getParameter("groupname");
        GroupModel model = GroupModel.getInstance();
        Group group = model.getGroup(groupname);
        List<String> students = model.getStudents(groupname);
        req.setAttribute("students", students);
        req.setAttribute("groupname", groupname);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/viewgroup.jsp");
        requestDispatcher.forward(req, resp);
    }
}
