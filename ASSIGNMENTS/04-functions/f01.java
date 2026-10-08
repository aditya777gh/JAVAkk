/* 1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.  */
import java.util.*;
class f01{

    public static int max(int a, int b, int c){
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }

    public static int min(int a, int b, int c){
        int min=a;
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b=sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c=sc.nextInt();
        f01 obj=new f01();
        System.out.println("Maximum number is: " + obj.max(a, b, c));
        System.out.println("Minimum number is: " + obj.min(a, b, c));
    }
}

/*
Enter 1st number: 45
Enter 2nd number: 85
Enter 3rd number: 37
Maximum number is: 85
Minimum number is: 37
 */