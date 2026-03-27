package org.example;

import java.util.List;
import java.util.Scanner;


public class Main {
    static void main() {
       IO.println("Welcome to the Attendance Tracker!");
       List<Student> studentList = Registrar.students;
       Scanner sc = new Scanner(System.in);
        if(studentList.isEmpty()) {
          IO.println("There currently no student registered, please register at least one Student");
          Registrar.registerStudent();
        }
        IO.print(String.format("There are currently %d registered, do you want to start collection the attendance? y/n",  studentList.size()));
        String startMarkingAttendance = sc.nextLine();
        if(startMarkingAttendance.equals("y")){
            Attendance.markAttendance();
            Attendance.printPresentStudents();
            Attendance.printAbsentStudents();
        }
        IO.println("Thank you for using the attendance tracker!");
        IO.println(String.format("The total amount of present students is %d", Attendance.presentStudentCount()));
    }
}
