/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdatabase;

import java.util.Scanner;

/**
 *
 * @author Adil Abdullayev
 */
public class StudentDatabaseApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Ask how many users we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner in=new Scanner(System.in);
        int numOfStudents=in.nextInt();
        Student[] students=new Student[numOfStudents];
        
        //Create n number of students
        
        for(int n=0;n<numOfStudents;n++){
         students[n]=new Student();
         students[n].enroll();
         students[n].payTuition();
         
        
        }
        for(int n=0;n<numOfStudents;n++){
        System.out.println(students[n].showInfo());
        }
    }
    
}
