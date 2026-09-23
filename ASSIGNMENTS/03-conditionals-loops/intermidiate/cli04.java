// 4. Calculate Discount Of Product
import java.util.*;
class cli04{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter price of product ");
        double p=sc.nextDouble();
        System.out.println("enter discount % ");
        double  d=sc.nextDouble();
        System.out.println("discount of product "+((d*p)/100));
    }
}
/*
enter price of product 
100
enter discount % 
5
discount of product 5.0
 */