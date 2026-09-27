// 19. HCF Of Two Numbers Program
import java.util.*;
class cli19{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        while(b!=0){
            c=a%b;
            a=b;
            b=c;
        }
        System.out.println("HCF of two numbers is "+a);
    }
}
/*
enter two numbers
36
96 
HCF of two numbers is 12 */
