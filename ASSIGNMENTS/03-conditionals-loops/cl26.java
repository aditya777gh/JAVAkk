/* 26. Addition Of Two Numbers */
import java.util.*;
class cl26{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int n,sum=0;
        for(int i=1;i<=2;i++){
            n=sc.nextInt();
            sum=sum+n;
        }
        System.out.println("addition of two numbers is: "+sum);
    }
}
/*
enter two numbers
15
17
adiition of two numbers is: 32
 */