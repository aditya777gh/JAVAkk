// 8. Calculate Depreciation of Value
import java.util.*;
class cli08{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principal value of asset");
        double p=sc.nextInt();
        System.out.println("enter rate of depriciation");
        double r=sc.nextInt();
        System.out.println("enter time in years");
        double t=sc.nextInt();
        double v=p*Math.pow(1-(r/100),t);
        System.out.println("depriciated value is "+v);
        System.out.println("depreciation value is "+(p-v));
    }
}
/*
enter principal value of asset
1000
enter rate of depriciation
2
enter time in years
1
depriciated value is 980.0
depreciation value is 20.0 */