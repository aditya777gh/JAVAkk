/* 6. Input currency in rupees and output in USD. */

import java.util.*;
class jp6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter currency in rupees");
        float r=sc.nextFloat();
        System.out.println("cureency in USD is "+(r*95));
    }

}

/*
enter currency in rupees
21.53  
cureency in USD is 2045.3501
 */