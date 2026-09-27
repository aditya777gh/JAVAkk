// 21. Java Program Vowel Or Consonant
import java.util.*;
class cli21{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your character");
        char ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'  ){
            System.out.println("it is Vowel");
        }
        else{
            System.out.println("it is consonant");
        }
    }
}
/*
enter your character
f 
it is consonant
PS D:\JAVA+DSA\JAVAkk\ASSIGNMENTS\03-conditionals-loops\intermediate> java cli21.java
enter your character
a 
it is Vowel
PS D:\JAVA+DSA\JAVAkk\ASSIGNMENTS\03-conditionals-loops\intermediate> java cli21.java
*/