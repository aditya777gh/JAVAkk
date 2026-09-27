// 18. Future Investment Value
import java.util.Scanner;
class cli18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter present investment amount (PV):");
        double pv = sc.nextDouble();

        System.out.println("Enter annual interest rate in % (r):");
        double rate = sc.nextDouble();

        System.out.println("Enter time period in years (t):");
        double time = sc.nextDouble();

        // Formula: FV = PV * (1 + r/100)^t
        double fv = pv * Math.pow((1 + (rate / 100.0)), time);

        System.out.printf("Future Investment Value: %.2f\n", fv);

        sc.close();
    }
}
/*
Enter present investment amount (PV):
10000
Enter annual interest rate in % (r):
2
Enter time period in years (t):
4
Future Investment Value: 10824.32
 */