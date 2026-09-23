// 10. Calculate CGPA Java Program
import java.util.*;
class cli10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int n=sc.nextInt();
        double totalpoints=0;
        double totalcredits=0;
        for(int i=1; i<=n; i++){
            System.out.println("Enter grade points out of 10 in subject "+i);
            double grade=sc.nextDouble();
            System.out.println("Enter credits for subject "+i);
            double credit=sc.nextDouble();
            totalpoints+=grade*credit;
            totalcredits+=credit;
        }
        System.out.println("CGPA is "+(totalpoints/totalcredits));
    }
}
/*
Enter number of subjects: 
3
Enter grade points out of 10 in subject 1
7
Enter credits for subject 1
2
Enter grade points out of 10 in subject 2
8
Enter credits for subject 2
4
Enter grade points out of 10 in subject 3
9
Enter credits for subject 3
5
CGPA is 8.272727272727273
 */