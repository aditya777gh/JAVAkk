// 2. Calculate Electricity Bill
import java.util.*;
class cli02{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter electricity bill units");
        int n=sc.nextInt();
        int bill=0;
        if(n<=100){
            bill=0;
        }
        else if(n<=200){
            bill=(n-100)*2;
        }
        else if(n<=300){
            bill=200+((n-200)*3);
        }
        else if(n>300){
            bill=500+((n-300)*4);
        }
        System.out.println("the amount of electricity bill is "+bill);
    }
}
/*
enter electricity bill units
301
the amount of electricity bill is 504
 */