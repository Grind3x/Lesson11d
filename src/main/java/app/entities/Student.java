package app.entities;

import java.util.Objects;

public class Student {
    private String name;
    private String lastname;
    private String course;

    public Student() {
    }

    public Student(String name, String lastname, String course) {
        super();
        this.name = name;
        this.lastname = lastname;
        this.course = course;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(lastname, student.lastname) &&
                Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, lastname, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
