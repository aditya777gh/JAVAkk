/* 8. To find out whether the given String is Palindrome or not. */

import java.util.*;
class jp8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
        String a=sc.nextLine();
        String b="";
        for(int i=a.length()-1; i>=0; i--){
            b=b+a.charAt(i);
        }
        if(b.equalsIgnoreCase(a)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not paindrome");
        }
    }
}

/*
Malayalam
String is palindrome
 */