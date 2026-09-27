// 25. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
import java.util.*;
class cli25{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of days in august");
        int d=sc.nextInt();
        System.out.println("number of days he can go out to with his friends "+d/2);
    }
}