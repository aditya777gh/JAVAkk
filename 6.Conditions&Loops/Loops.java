public class Loops {
    public static void main(String args[]){
        /*syntax for loops:
            for(initialization; condition; increment/decrement){
            //body
            }
        */
       // Q. print numbers from 1 to 5
       for(int num=1; num<=5; num+=1){
        System.out.println(num);
       }
        /*while loops:
        Syntax:
        while(condition)
            //body
        */
        int num2=11;
        while(num2<=15){
            System.out.println(num2);
            num2+=1;
        }

        /*
        do-while loop:
        syntax:
        do{
        } while(condition);
        */

        int n=1;
        do{
            System.out.println(n);
            n++;
        }while(n<=5);
       }
    }

