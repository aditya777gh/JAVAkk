// 9. Calculate Batting Average
import java.util.*;
class cli09{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter runs of batsman");
        double r=sc.nextInt();
        System.out.println("Enter total adismissals ");
        double o=sc.nextInt();
        System.out.println("batting average is "+(r/o));
    }
}
/*
Enter runs of batsman
114
Enter total adismissals 
3
batting average is 38.0
 */