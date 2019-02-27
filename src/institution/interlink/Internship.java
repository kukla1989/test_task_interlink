package institution.interlink;

import person.Student;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Internship {
    public String name;
    private List<Student> students = new ArrayList<>();

    public Internship(String name) {
//       this.name = name;
    }

    public void setStudents(List<Student> students){
        this.students = students;
    }

    private List<Student> choosePassingStudents(){
        List<Student> passedStudents = new LinkedList<>();
        for (Student studentsUndergoingATest : this.students) {
            if (studentsUndergoingATest.getKnowledge().getLevel() >= 3){
                passedStudents.add(studentsUndergoingATest);
            }
        }
        return passedStudents;
    }

    public String getStudents() {
        StringBuilder stringBuilder = new StringBuilder();
        passedStudents = choosePassingStudents();
        for(i = 0; i < passedStudents.size(); i++){
            stringBuilder.append(passedStudents.get(i));
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

}
