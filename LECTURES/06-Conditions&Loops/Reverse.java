import java.util.*;
class Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int n=sc.nextInt();
        int rem,rev=0;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        System.out.println("reverse of the number is: "+rev);
    }

}

/* 4567
reverse of the number is: 7654
*/