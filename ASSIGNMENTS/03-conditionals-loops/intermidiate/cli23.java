// 23. Check Leap Year Or Not
import java.util.*;
class cli23{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your year");
        int n=sc.nextInt();
        if((n%4==0 && n%100!=0) || n%400==0){
            System.out.println("it is a leap year");
        }
        else{
            System.out.println("it is not leap year");
        }
    }
}
/*
enter your year
2004
it is a leap year
PS D:\JAVA+DSA\JAVAkk\ASSIGNMENTS\03-conditionals-loops\intermediate> java cli23.java
enter your year
2000
it is a leap year
PS D:\JAVA+DSA\JAVAkk\ASSIGNMENTS\03-conditionals-loops\intermediate> java cli23.java
enter your year
1900
it is not leap year
 */