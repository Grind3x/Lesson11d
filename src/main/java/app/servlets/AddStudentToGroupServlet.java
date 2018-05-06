package app.servlets;

import app.entities.Group;
import app.entities.Student;
import app.model.GroupModel;
import app.model.StudentModel;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddStudentToGroupServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/addstudenttogroup.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname = req.getParameter("firstname");
        String secondname = req.getParameter("secondname");
        String groupName = req.getParameter("groupname");

        if (!(firstname.equals("")) && !(secondname.equals("") && !(groupName.equals("")))) {
            StudentModel stModel = StudentModel.getInstance();
            GroupModel grModel = GroupModel.getInstance();
            Student student;
            if ((student = stModel.getStudent(firstname + " " + secondname)) != null) {
                Group group;
                if ((group = grModel.getGroup(groupName)) != null) {
                    group.addStudent(student);
                }
            }
            req.setAttribute("firstname", firstname);
            req.setAttribute("secondname", secondname);
            req.setAttribute("groupname", groupName);

            doGet(req, resp);
        }
        doGet(req,resp);
    }
}
