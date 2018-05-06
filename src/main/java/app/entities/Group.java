package app.entities;

import java.util.ArrayList;
import java.util.Objects;

public class Group {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    public Group() {
    }

    public Group(String name) {
        super();
        this.name = name;
    }

    public void addStudent(Student a) {
        students.add(a);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(name, group.name) &&
                Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, students);
    }
}
