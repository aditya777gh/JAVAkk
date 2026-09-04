/* 21. Fibonacci Series In Java Programs */
import java.util.*;
class cl21{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nth term ");
        int n=sc.nextInt();
        int a=0, b=1, c;
        System.out.print("Fibonacci series is: "+a+" ");
        for(int i=1; i<n; i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(a+" ");
        }
    }
}
/*
enter the nth term 
10
Fibonacci series is: 0 1 1 2 3 5 8 13 21 34 
 */