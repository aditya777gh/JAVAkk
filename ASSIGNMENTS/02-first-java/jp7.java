/* 7. To calculate Fibonacci Series up to n numbers. */

import java.util.*;
class jp7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nth term");
        int n=sc.nextInt();
        int a=0, b=1, c;
        System.out.print(a+" ");
        for(int i=1; i<n; i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(a +" ");
        }
    }
}