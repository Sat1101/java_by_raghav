package Array;

public class PassingArrayToMethods {
    public static void main(String[] args){
        int[] arr={23,56,21,34};
        System.out.println(arr[3]);
        change(arr);
        System.out.println(arr[3]);

    }
    public static void change(int[] y){
        y[3]=88;
    }
}
