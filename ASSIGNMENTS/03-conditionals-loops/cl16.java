/* 16. Volume Of Cylinder*/
import java.util.*;
class cl16{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius ");
        float r=sc.nextFloat();
        System.out.println("enter height");
        float h=sc.nextFloat();
        System.out.println("volume of cylinder is "+(Math.PI)*(Math.pow(r,2))*h);
    }
}
/*
enter radius 
4
enter height
9
volume of cylinder is 452.3893421169302
 */