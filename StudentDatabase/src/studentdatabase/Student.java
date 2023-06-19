/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdatabase;

import java.util.Scanner;

/**
 *
 * @author Adil Abdullayev
 */
public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses=null;
    private int tuitionBalance=0;
    private static int costOfCourse=600;
    private static int id=1000;
    
    
    
    //Constructor: Prompt user to enter stundet's name and year
    public Student(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first name: ");
        this.firstName=in.nextLine();
        
        System.out.println("Enter last name: ");
        this.lastName=in.nextLine();
    
        System.out.println("1-Freshman\n2-Sophmore\n3-Junior\n4-Senior\nEnter student class level: ");
        this.gradeYear=in.nextInt();
        
        setStudentID();        
        
    }
    
    //Generate an ID
        private String setStudentID(){
            //grade level+id
                    id++;
            this.studentID= gradeYear+ ""+id;
           return this.studentID;
        }
    
    //Enroll in courses
    public void enroll(){
    //get inside a loop user hits 0
      do{
        System.out.println("Enter course to enroll(Q to quit): ");
        Scanner in=new Scanner(System.in);
        String course =in.nextLine();
        if(!course.equals("Q")){
        courses=courses+"\n "+course;
        tuitionBalance=tuitionBalance+costOfCourse;
        }
        else{ 
            break;
        }
      }while(1 != 0);
    }

    //Wiev balance
    public void viewBalance(){
        System.out.println("Your balance is: $"+tuitionBalance);
    }
    
    //Pay Tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in=new Scanner(System.in);
        int payment=in.nextInt();
        tuitionBalance=tuitionBalance-payment;
        System.out.println("Thank you for your payment of $"+payment);
        viewBalance();
    }
    
    
    //Show status
    public String showInfo(){
    return "Name: "+firstName+""+lastName+
            "\nGrade Level: "+gradeYear+
            "\nStudent ID: "+studentID+
            "\nCourses Enrolled: "+courses+
            "\nBalance: $"+tuitionBalance;
    
    
    }
    
    
    
    
    
}
