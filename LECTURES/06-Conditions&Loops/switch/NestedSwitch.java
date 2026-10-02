import java.util.*;
class NestedSwitch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int empID=sc.nextInt();
        String department=sc.next();
        switch(empID){
            case 1:
                System.out.println("aditya gupta");
                break;
            case 2:
                System.out.println("Vijay ");
                break;
            case 3:
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;  
                    case "management":
                        System.out.println("management department");
                    default:
                        System.out.println("no dept");
                }
                break;
                default:
                    System.out.println("enter correct ID");
        }
    }
}