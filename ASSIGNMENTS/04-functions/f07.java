/* 7. Define a method to find out if a number is prime or not. */
import java.util.*;
class f07{

    public boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        f07 obj=new f07();
        if(obj.isPrime(num)){
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

/*
Enter a number: 11
11 is a prime number.
PS D:\JAVA+DSA\JAVAkk\ASSIGNMENTS\04-functions> java f07.java
Enter a number: 8436
8436 is not a prime number.
*/