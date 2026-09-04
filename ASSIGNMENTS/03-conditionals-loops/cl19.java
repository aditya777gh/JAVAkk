/* 19. Curved Surface Area Of Cylinder */
import java.util.*;
class cl19{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius ");
        float r=sc.nextFloat();
        System.out.println("enter height");
        float h=sc.nextFloat();
        System.out.println("CSA of cylinder is "+2*(Math.PI)*r*h);
    }
}
/*
enter radius 
5
enter height
9
CSA of cylinder is 282.7433388230814
 */