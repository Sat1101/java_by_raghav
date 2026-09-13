package Array;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args){
        int[] arr={23,65,75,89,12};
//        int[] x=arr;  //Shallow copy of array
//        x[0]=100;
//        System.out.println(arr[0]);
        int[] y= Arrays.copyOf(arr,arr.length);  //deep copy of array
        y[0]=100;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
}
