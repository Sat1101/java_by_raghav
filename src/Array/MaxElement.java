package Array;

public class MaxElement {
    public static void main(String[] args){
        int[] arr={12,34,54,67,13,43};
        int max= arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
