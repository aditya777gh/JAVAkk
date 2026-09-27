// 20. LCM Of Two Numbers
import java.util.*;
class cli20{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c, d=a, e=b;
        while(b!=0){
            c=a%b;
            a=b;
            b=c;
        }
        System.out.println("LCM of two numbers is "+((d*e)/a));
    }
}
/*
enter two numbers
54
25
LCM of two numbers is 1350
 */