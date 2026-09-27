// 22. Perfect Number In Java
import java.util.*;
class cli22{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("number is Perfect Number");
        }
        else{
            System.out.println("not Perfect Number");
        }
    }
}
/*
enter your number
6
number is Perfect Number
 */