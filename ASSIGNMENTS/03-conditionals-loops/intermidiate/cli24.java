// 24. Sum Of A Digits Of Number
import java.util.*;
class cli24{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("sum of digits of the number is "+sum);
    }
}
/*
enter number
1247
sum of digits of the number is 14
 */