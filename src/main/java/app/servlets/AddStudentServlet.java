package app.servlets;

import app.entities.Student;
import app.model.StudentModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddStudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/addstudent.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname = req.getParameter("firstname");
        String secondname = req.getParameter("secondname");
        String course = req.getParameter("course");
        Student student = new Student(firstname, secondname, course);
        StudentModel model = StudentModel.getInstance();
        model.addStudent(student);
        req.setAttribute("firstname", firstname);
        req.setAttribute("secondname", secondname);
        doGet(req, resp);
    }
}
