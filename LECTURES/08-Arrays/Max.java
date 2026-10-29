import java.util.*;
public class Max {
    public static void main(String[] args) {
        int[] arr={1,43,26,76,213};
        System.out.println(max(arr));
        System.out.println(maxRange(arr , 1 , 3));
    }

    static int max(int[] arr){

        //edge cases
        if(arr.length==0){
            return -1;
        }

        int maxVal=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int[] arr , int start, int end){
       
        //edge cases
        if(end>start){
            return -1;
        }

        if(arr==null){
            return -1;
        }

        int maxVal2=arr[start];
        for(int i=start ; i< end; i++){
            if(arr[i]>maxVal2){
                maxVal2=arr[i];
            }
        }
        return maxVal2;
    }
}
