import java.util.*;
class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit=sc.next();

        switch(fruit){
            case "mango":
                System.out.println("king of fruits");
                break;
            case "apple":
                System.out.println("a sweet red fruit");
                break;
            default:
                System.out.println("please enter a valid fruit");
            
        }
    }
}