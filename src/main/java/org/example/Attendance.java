package org.example;

import java.util.List;
import java.util.Scanner;

public class Attendance {
    static void markAttendance(){
        for(Student student: Registrar.students){
            Scanner sc = new Scanner(System.in);
            IO.println(String.format("Is %s present? y/n", student.getName()));
            String isStudentPresent = sc.nextLine();
            if(isStudentPresent.equals("y")){
                student.setPresent(true);
            }
        }
    }
    static void printPresentStudents(){
        IO.println("========Present Students=========");
        for(Student student: Registrar.students){
            if(student.isPresent()){
                IO.println(student.getName());
            }
        }
    }

    static int presentStudentCount(){
        int count = 0;
        for(Student student: Registrar.students) {
            if (student.isPresent()) {
                count += 1;
            }
        }
        return count;
    }

    static void printAbsentStudents(){
        IO.println("==========Absent Students===========");
        for(Student student: Registrar.students){
            if(!student.isPresent()){
                IO.println(student.getName());
            }
        }
    }

    static void markAllAbsent(){
        for(Student student: Registrar.students){
            student.setPresent(false);
        }
    }
}
