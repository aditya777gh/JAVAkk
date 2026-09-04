/* 7. Area Of Equilateral Triangle */
import java.util.*;
class cl7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter side of triangle");
        float s=sc.nextFloat();
        System.out.println("area of equi triangle is  is "+(float)((Math.sqrt(3)/4)*(Math.pow(s,2))));

    }
} 
/*
enter side of triangle
12
area of equi triangle is  is 62.35383 */