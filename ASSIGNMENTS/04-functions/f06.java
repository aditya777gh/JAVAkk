/* 6. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method. */
import java.util.*;
class f06{
        
    public static double circumference(double radius){
        return 2*3.14*radius;
    }

    public static double area(double radius){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double radius=sc.nextDouble();
        f06 obj=new f06();
        System.out.println("Circumference of circle is: " + obj.circumference(radius));
        System.out.println("Area of circle is: " + obj.area(radius));
    }
}

/*
Enter the radius of circle: 49
Circumference of circle is: 307.72
Area of circle is: 7539.14
*/