/* 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions) */

import java.util.*;
class jp4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        System.out.println("Enter your operator");
        char op=sc.next().trim().charAt(0);
        if(op=='+'){
            System.out.println("value is "+(a+b));
        }
        else if(op=='-'){
            System.out.println("value is "+(a-b));
        }
        else if(op=='*'){
            System.out.println("value is "+(a*b));
        }
        else if(op=='/'){
            System.out.println("value is "+(a/b));
        }
    }
}

/*
Enter 1st number
4
Enter 2nd number
7
Enter your operator
+
value is 11


Enter 1st number
4
Enter 2nd number
7
Enter your operator
-
value is -3
 */