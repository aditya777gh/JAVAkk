/* 14. Volume Of Cone Java Program */
import java.util.*;
class cl14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius of cone");
        double r=sc.nextDouble();
        System.out.println("enter height of cone");
        double h=sc.nextDouble();
        System.out.println("volume of cone "+((1/3.0)*(Math.PI)*(Math.pow(r,2))*h));
    }
}
/*
enter radius of cone
6
enter height of cone
8
volume of cone 301.59289474462014
 */