package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registrar {
    final static List<Student> students = new ArrayList<Student>();
    static void registerStudent(){
        Scanner sc = new Scanner(System.in);
        boolean addStudents = true;
        String isAddingStudents;
        while(addStudents){
            IO.println("Enter Student Name:");
            String stName = sc.nextLine();
            IO.println("Enter Student Email:");
            String stEmail = sc.nextLine();
            boolean present = false;
            IO.println("Enter Student Classname");
            String stClassName = sc.nextLine();
            Student student = new Student(stName, stEmail, present, stClassName);
            students.add(student);
            IO.println("Do you want to continue adding students? y/n");
            isAddingStudents = sc.nextLine();
            if(isAddingStudents.equals("n")){
                addStudents = false;
            }
        }
    }
    static List<Student> getStudentsRegistrationList(){
        return students;
    }

}
