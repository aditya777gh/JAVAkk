/* 25. Take integer inputs till the user enters 0 and print the largest number from all. */
import java.util.*;
class cl25{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n, max;
        n=sc.nextInt();
        max=n;
        while(true){
           n=sc.nextInt();
           if(n==0){
            break;
           }
           if(n>max){
            max=n;
           }
        }
        System.out.println("largest is "+max);
    }
}
/*
9
8
1
5
7
6
46
688668
25
7446
0
largest is 688668
*/