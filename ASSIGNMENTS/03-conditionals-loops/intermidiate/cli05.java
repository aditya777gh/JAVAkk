// 5. Calculate Distance Between Two Points
import java.util.*;
class cli05{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter coordinatges of 1st point");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        System.out.println("enter coordinatges of 2nd point");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        double dis=Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y2),2));
        System.out.println("distance between points "+dis);
    }
}
/*
enter coordinatges of 1st point
1
3
enter coordinatges of 2nd point
4
8
distance between points 3.0
 */