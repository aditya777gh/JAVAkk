// 11. Compound Interest Java Program
import java.util.*;
class cli11{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principal");
        double p=sc.nextInt();
        System.out.println("enter rate of interest");
        double r=sc.nextInt();
        System.out.println("enter time in years");
        double t=sc.nextInt();
        double a=p*Math.pow(1+(r/100),t);
        System.out.println("total amount is "+a);
        System.out.println("compound interest is "+(a-p));
    }
}
/*
enter principal
10000
enter rate of interest
3
enter time in years
4
total amount is 11255.0881
compound interest is 1255.0881000000008
 */