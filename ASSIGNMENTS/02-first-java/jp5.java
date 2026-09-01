/* 5. Take 2 numbers as input and print the largest number. */

import java.util.*;
class jp5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
        int a=sc.nextInt();
        System.out.println("enter 2nd number");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("largest number is "+a);
        }
        else{
            System.out.println("largest number is "+b);
        }
    }
}

/*
enter 1st number
654
enter 2nd number
54
largest number is 654
 */