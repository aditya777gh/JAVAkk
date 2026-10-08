/* 4. Write a program to print the sum of two numbers entered by user by defining your own method. */
import java.util.*;
class f04{
    
    public static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b=sc.nextInt();
        f04 obj=new f04();
        System.out.println("Sum of two numbers is: " + obj.sum(a, b));
    }
}

/*
Enter 1st number: 42
Enter 2nd number: 85
Sum of two numbers is: 127
 */