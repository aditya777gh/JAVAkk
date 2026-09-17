/* 24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop) */
import java.util.*;
class cl24{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            sum=sum+n;
            n=sc.nextInt();
        }
        System.out.println("sum of numbers is: "+sum);
    }
}
/*
enter numbers
5
8
4
2
0
sum of numbers is: 19
 */

/* ALTERNATE  
while(true){
int n=sc.nextInt();
if(n==0){
break;}
sum=sum+n;}
*/