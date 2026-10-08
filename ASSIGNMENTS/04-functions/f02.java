/* 2. Define a program to find out whether a given number is even or odd. */
import java.util.*;
class f02{

    public static String oddeve(int num){
        if(num%2==0){
            return "even";
        }
        else{
            return "odd";
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        f02 obj=new f02();
        System.out.println("the number is "+(obj.oddeve(num)));
    }
}

/*
Enter a number: 97518
the number is even
*/