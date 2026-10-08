/* 10. Write a function to find if a number is a palindrome or not. Take number as parameter. */
import java.util.*;
class f10{
    public static boolean isPalindrome(int n){
        int temp=n;
        int rev=0;
        while(temp>0){
            int digit=temp%10;
            rev=rev*10+digit;
            temp/=10;
        }
        return rev==n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check if it is a palindrome: ");
        int num=sc.nextInt();
        boolean result = f10.isPalindrome(num);
        if(result){
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}

/*
Enter a number to check if it is a palindrome: 14541
14541 is a palindrome.
 */