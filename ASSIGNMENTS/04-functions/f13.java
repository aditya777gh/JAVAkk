/* 13. Write a function that returns all prime numbers between two given numbers. */
import java.util.*;
class f13{
    public static String allPrime(int i, int n){
        String result="";
        for(int j=i; j<=n; j++){
            int c=0;
            for(int k=1; k<=j; k++){
                if(j%k==0){
                    c++;
                }
            }
            if(c==2){
                result+=  j + " ";
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
        int i=sc.nextInt();
        System.out.println("enter the nth number");
        int n=sc.nextInt();
        System.out.println(allPrime(i,n));
    }

}
/*
enter 1st number
4 
enter the nth number
17
5 7 11 13 17
*/