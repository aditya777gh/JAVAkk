// 13. Sum Of N Numbers
import java.util.*;
class cli13{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of numbers ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            int a=sc.nextInt();
            sum+=a;
        }
        System.out.println("sum of N numbers is "+sum);
    }
}
/*
enter number of numbers 
3
5
7
8
sum of N numbers is 20
 */