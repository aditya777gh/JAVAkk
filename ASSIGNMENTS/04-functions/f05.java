/* 5. Define a method that returns the product of two numbers entered by user. */
import java.util.*;
class f05{

    public int product(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a=sc.nextInt(); 
        System.out.print("Enter 2nd number: ");
        int b=sc.nextInt();
        f05 obj=new f05();
        System.out.println("Product of two numbers is: " + obj.product(a, b));
    }
}

/*
Enter 1st number: 95
Enter 2nd number: 72
Product of two numbers is: 6840
*/