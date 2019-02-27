package institution;

import java.util.*;

import person.Student;
import person.consciousness.Knowledge;

public class University {
    private String name;
    ArrayList<Student> students = new ArrayList<Student>();

    public University(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    private  void giveStudentsKnowledge(){
        Random random = new Random();
        for (Student studentWithoutKnowledge :this.students) {
            studentWithoutKnowledge.setKnowledge(new Knowledge(random.nextInt(5)));
        }
    }

    public void addStudent(Student student) {
        this.students.add(student);
        giveStudentsKnowledge();
    }
}
