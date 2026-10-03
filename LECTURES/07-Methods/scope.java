import java.util.*;

public class scope {
    public static void main(String[] args) {
        
    
    int a=10;
    int b=20;
    {
        a=100;// reassign the origin of ref. var.
        int c=99;
    }   
    System.out.println(c);
}
}

static void random(){
    int num=67;
    System.out.println();
}
