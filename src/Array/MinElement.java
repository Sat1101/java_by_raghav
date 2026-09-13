package Array;

public class MinElement {
    public static void main(String[] args){
        int[] arr={12,34,54,67,13,43};
        int min= arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
