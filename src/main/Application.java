package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko"));
        university.addStudent(new Student("Julia Veselkina"));
        university.addStudent(new Student("Maria Perechrest"));
        university.giveStudentsKnowledge();

        Internship internship = new Internship("Interlink");
        System.out.println("List of internship's students:");
        internship.setStudents(university.getStudents());
        System.out.println(internship.getStudents());
    }
}
