/* 3. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote. */
import java.util.*;
class f03{

    public static String eligible(int age){
        if(age>=18){
            return "eligible";
        }
        else{
            return "not eligible";
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        f03 obj=new f03();
        System.out.println("You are "+(obj.eligible(age))+" to vote.");
    }
}
/*
Enter your age: 23
You are eligible to vote.
*/