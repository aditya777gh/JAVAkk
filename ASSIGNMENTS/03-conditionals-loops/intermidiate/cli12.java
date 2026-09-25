// 12. Calculate Average Marks
import java.util.*;
class cli12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total number of subjects");
        int n=sc.nextInt();
        double total=0;
        for(int i=1; i<=n; i++){
            System.out.println("Enter marks of subject "+i);
            double m=sc.nextInt();
            total+=m;
        }
        System.out.println("Average marks "+(total/n));
    }
}
/*
enter total number of subjects
2
Enter marks of subject 1
78
Enter marks of subject 2
91
Average marks 84.5
 */