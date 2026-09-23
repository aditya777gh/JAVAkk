/* 1. Factorial Program In Java */
import java.util.*;
class cli01{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println("factorial is "+fact);
    }
}
/*
enter number
5
factorial is 120
 */