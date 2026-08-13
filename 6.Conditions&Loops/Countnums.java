import java.util.*;
public class Countnums {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:");
        int a=sc.nextInt();
        System.out.println("enter digit to be counted");
        int n=sc.nextInt();
        int rem,count=0;
        while(a>0){
            rem=a%10;
            if(rem==n){
                count+=1;
            }
            a=a/10;
        }
        System.out.println("frequency of digit is: "+count);
    }
}
