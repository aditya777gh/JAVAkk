/* 8. Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below: */
import java.util.*;
class f08{

    public static void displayGrade(double marks){
        if(marks >= 90){
            System.out.println("Grade: A+");
        } else if(marks >= 80){
            System.out.println("Grade: A");
        } else if(marks >= 70){
            System.out.println("Grade: B");
        } else if(marks >= 60){
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your marks (out of 100): ");
        double marks=sc.nextDouble();
        f08.displayGrade(marks);
    }
}

/*
Enter your marks (out of 100): 97
Grade: A+
 */