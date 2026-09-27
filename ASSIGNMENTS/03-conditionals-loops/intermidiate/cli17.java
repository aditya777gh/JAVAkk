// 17. Find if a number is palindrome or not
import java.util.*;
class cli17{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int n=sc.nextInt();
        int temp=n ,rev=0, d;
        for(int i=temp; i>0; i=i/10){
            d=i%10;
            rev=(rev*10)+d;
        }
        if(rev==n){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }

    }
}
/*
enter your number
145636541
number is palindrome
 */