package institution;

import java.util.*;

import person.Student;
 
public class University {
    private String name;
    ArrayList<Student> students = new ArrayList<Student>();

    public University(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }
}
