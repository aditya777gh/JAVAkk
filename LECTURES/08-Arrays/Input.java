import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        //input using for loops
        // for(int i=0; i<arr.length; i++){
        //     arr[i]=sc.nextInt();
        // }

        // System.out.println(Arrays.toString(arr));

        // for(int i=0; i<arr.length; i++){
        //     System.out.print (arr[i] + " ");
        // }

        // for(int num : arr){
        //     System.out.print(num+" ");
        // }

        //array of objects
        String[] str=new String[4];
        for(int i=0; i<str.length; i++){
            str[i]=sc.next();
        }

        System.out.println(Arrays.toString(str));



    }
}
