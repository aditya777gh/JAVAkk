/* 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest. */

import java.util.*;
class jp3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal");
        int p=sc.nextInt();
        System.out.println("Enter time");
        int t=sc.nextInt();
        System.out.println("Enter rate");
        int r=sc.nextInt();
        float si=(p*r*t)/100;
        System.out.println("simple interest is "+si);
    }
}

/*
Enter principal
5345
Enter time
3
Enter rate
12 
simple interest is 1924.0
 */