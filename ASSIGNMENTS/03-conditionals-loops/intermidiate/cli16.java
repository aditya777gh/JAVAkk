// 16. Reverse A String In Java
import java.util.*;
class cli16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1; i>=0 ;i--){
            rev+=s.charAt(i);
        }
        System.out.println("reverse of string is "+rev);
    }
}
/*
enter your string
He is a boy.
reverse of string is .yob a si eH
 */