import java.util.Scanner;
public class Temperature {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float tempC=in.nextFloat();
        float tempF=(tempC*9/5)+32;
        System.out.println("Temperature in Fahrenheit: "+tempF);
    }
}

/*Enter temperature in Celsius: 6
Temperature in Fahrenheit: 42.8 */
