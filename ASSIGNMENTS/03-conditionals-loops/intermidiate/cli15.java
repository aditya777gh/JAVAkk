// 15.Find Ncr & Npr
import java.util.*;
class cli15{
    public static int factorial(int num){
        int fact=1;
        for(int i=1; i<=num; i++){
            fact*=i;
        }
        return fact;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        System.out.println("enter the value of r");
        int r=sc.nextInt();

        if(n<0 || r<0 || r>n){
            System.out.println("invalid input ; condition: n>= r >=0");
        }
        else{
            int nPr=factorial(n)/factorial(n-r);
            int nCr=factorial(n)/(factorial(r)*factorial(n-r));
            System.out.println("permutation is "+nPr);
            System.out.println("combination is "+nCr);
        }
    }
}
/*
enter the value of n
7
enter the value of r
3
permutation is 210
combination is 35
 */