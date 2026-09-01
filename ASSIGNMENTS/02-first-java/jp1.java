/* 1. Write a program to print whether a number is even or odd, also take input from the user.*/
import java.util.*;
class jp1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}

/*
Enter your number
7
number is odd
*/