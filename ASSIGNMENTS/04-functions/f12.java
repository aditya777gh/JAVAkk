/* 12. Write a function to check if a given triplet is a Pythagorean triplet or not.  */
import java.util.*;
class f12{

    public static boolean isPythagoreanTriplet(int a, int b, int c){
        // Sort the numbers to identify the largest one
        int total=(int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        int maxsq=max*max;
        int sum=total-maxsq;
        return sum==maxsq;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three numbers to check if they form a Pythagorean triplet: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(isPythagoreanTriplet(a, b, c)){
            System.out.println("The numbers " + a + ", " + b + ", and " + c + " form a Pythagorean triplet.");
        } else {
            System.out.println("The numbers " + a + ", " + b + ", and " + c + " do not form a Pythagorean triplet.");
        }
    }
}
/*
Enter three numbers to check if they form a Pythagorean triplet: 5
3
4
The numbers 5, 3, and 4 form a Pythagorean triplet.
*/