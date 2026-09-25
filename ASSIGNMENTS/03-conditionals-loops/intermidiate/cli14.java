// 14. Armstrong Number In Java
import java.util.*;
class cli14{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int temp=n, temp1=n , c=0;
        while(temp!=0){
            c+=1;
            temp=temp/10;
        }
 
        int dig, arm=0;
        for(int i=temp1; i>0; i=i/10){
            dig=i%10;
            arm=arm+ (int)Math.pow(dig,c);
        }
        if(arm==n){
            System.out.println("it is an Armstrong Number");
        }
        else{
            System.out.println("not an armstrong number");
        }
    }
}
/*
enter number
153
it is an Armstrong Number
 */