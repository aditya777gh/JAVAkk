// 26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
import java.util.*;
class cli26{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your numbers");
        int nn=0, pe=0, po=0;
        while(true){
            int N=sc.nextInt();
            if(N<0){
                nn+=N;
            }
            else if(N>0 && N%2==0){
                pe+=N;
            }
            else if(N>0 && N%2!=0){
                po+=N;
            }
            else if(N==0){
                break;
            }
        }        
        System.out.println("sum of negative numbers= "+nn);
        System.out.println("sum of postive even numbers= "+pe);
        System.out.println("sum of positive odd numbers= "+po);
    }
}
/*
enter your numbers
1
2
-1
-4
6
3
0
sum of negative numbers= -5
sum of postive even numbers= 8
sum of positive odd numbers= 4 */