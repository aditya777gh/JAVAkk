import java.util.*;
class sum{
    public static void main(String[] args) {
        int ans = sum2();
        
        int ans=sum3(20,30);
    }

    // pass the value of numbers when you are calling the main()
    static int sum3(int a, int b){
        int sum=a+b;
        return sum;
    }

    // return the value
    static int sum2(){
         Scanner sc=new Scanner(System.in);
            System.out.println("enter 1st num");
            int sum=0;
            int num1=sc.nextInt();
            System.out.println("enter 2nd number");
            int num2=sc.nextInt();
            sum=num1+num2;
            return sum;
    }
    static void sum(){
             Scanner sc=new Scanner(System.in);
            System.out.println("enter 1st num");
            int sum=0;
            int num1=sc.nextInt();
            System.out.println("enter 2nd number");
            int num2=sc.nextInt();
            sum=num1+num2;
            System.out.println("sum of two numbers is "+sum);
        }
    /*
        return_type name(){
                / / body
                return statement;        
        }
    */
}