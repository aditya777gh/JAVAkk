/* 9.  To find Armstrong Number between two given number. */

import java.util.*;
class jp9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter last number");
        int b=sc.nextInt();
        System.out.println("Armstrong number between two numbers ");
        for(int i=a; i<=b; i++){
            int temp1=i, c=0;
            while(temp1!=0){
                c++;            //count no. of digits
                temp1=temp1/10;
            }

            int temp2=i, sum=0, n;
            while(temp2!=0){
                n=temp2%10;
                sum=sum + (int)Math.pow(n,c);
                temp2=temp2/10;
            }

            if(sum==i){
                System.out.println(i+" ");
            }
            
        }
    }
}

/*
enter 1st number
100
Enter last number
500
Armstrong number between two numbers 
153 
370 
371 
407 
 */