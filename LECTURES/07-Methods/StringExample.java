import java.util.*;
class StringExample{
    public static void main(String[] args) {
        // String message=greet();
        // System.out.println(message);

        String personalized=mygreet("Aditya Gupta");
        System.out.println(personalized);
    }

    static String mygreet(String name){
        String message="Hello " +name;
        return message;
    }

    static String greet(){
        String greeting="how are you?";
        return greeting;
    }
}