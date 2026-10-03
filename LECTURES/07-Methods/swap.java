import java.util.*;
class swap{
    public static void main(String[] args) {
        int a=10;
        int b=20;

        // swap numbers
        // int temp=a;
        // a=b;
        // b=temp;

        swap(a,b);
        System.out.println(a+" "+b);
        String name="kunal kushwaha";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name){
        name="Aditya Gupta";
    }
    static void swap(int a , int b){
        int temp=a;
        a=b;
        b=temp;
    }
}