package app.model;

import app.entities.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentModel {
    private static StudentModel instance = new StudentModel();

    private List<Student> students;

    public static StudentModel getInstance() {
        return instance;
    }

    private StudentModel() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudent(String fullname) {
        List<String> list = Arrays.asList(fullname.split(" "));

        for (Student student : students) {
            if ((student.getName().equals(list.get(0))) && (student.getLastname().equals(list.get(1)))) {
                return student;
            }
        }
        return null;
    }

    public List<String> listStudents() {
        List<String> array = new ArrayList<>();
        for (Student student : students) {
            array.add(student.getName() + " " + student.getLastname());
        }
        return array;
    }
}