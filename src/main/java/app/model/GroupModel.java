package app.model;
import app.entities.Group;
import app.entities.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GroupModel {
    private static GroupModel instance = new GroupModel();

    private List<Group> groups;

    public static GroupModel getInstance() {
        return instance;
    }

    private GroupModel() {
        groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public Group getGroup(String groupname) {
        for (Group group : groups) {
            if (group.getName().equals(groupname)) {
                return group;
            }
        }
        return null;
    }

    public List<String> getStudents(String groupname) {
        Group group = this.getGroup(groupname);
        if (group != null) {
            List<Student> students = group.getStudents();
            List<String> stStudents = new ArrayList<>();

            for (Student student : students) {
                System.out.println(student.getName() + " " + student.getLastname());
                stStudents.add(student.getName() + " " + student.getLastname());
            }
            return stStudents;
        }
        return null;
    }

    public List<String> listGroups() {
        return groups.stream()
                .map(Group::getName)
                .collect(Collectors.toList());
    }
}