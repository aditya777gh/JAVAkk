/* 9. Write a program to print the factorial of a number by defining a method named 'Factorial'.  */
import java.util.*;
class f09{
    public static int Factorial(int n){
        if(n==0 || n==1){
            return 1;
        } 
        else{
            int fact=1;
            for(int i=1; i<=n; i++){
                fact*=i;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num=sc.nextInt();
        int result = f09.Factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
/*
Enter a number to find its factorial: 5
Factorial of 5 is: 120
 */