// 3. Calculate Average Of N Numbers
import java.util.*;
class cli03{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many numbers you want to enter ");
        int n=sc.nextInt();
        double sum=0,num;
        for(int i=1; i<=n; i++){
            num=sc.nextDouble();
            sum=sum+num;
        }
        System.out.println("average of n numbers is "+(sum/n));
    }
}
/*
enter how many numbers you want to enter 
2
4
5
average of n numbers is 4.5
 */