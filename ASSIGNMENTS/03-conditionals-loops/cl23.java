/* 23. Input a number and print all the factors of that number (use loops). */
import java.util.*;
class cl23{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("input number");
        int n=sc.nextInt();
        System.out.println("factors are:");
        for(int i=1; i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
/*
input number
12
factors are:
1
2
3
4
6
12
 */