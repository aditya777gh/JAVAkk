// 6. Calculate Commission Percentage
import java.util.*;
class cli06{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total sales amount ");
        double s=sc.nextDouble();
        System.out.println("enter commission amount ");
        double  c=sc.nextDouble();
        System.out.println("commission percentage "+((c/s)*100)+"%");
    }
}
/*
enter total sales amount 
2000
enter commission amount 
50
commission percentage 2.5%
 */