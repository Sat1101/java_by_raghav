package Recursion;

public class RecursionOnArray {
    static void main() {
        int[] arr={22,45,23,64,21,6,3};
        recPrint(arr,0);
    }

    static void recPrint(int[] arr,int idx) {
        int n=arr.length;
        if(idx==n)return;
        System.out.println(arr[idx]);
        recPrint(arr,idx+1);


    }
}
