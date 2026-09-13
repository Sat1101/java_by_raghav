package Array;

public class SecondLargestElement {
    public static void main(String[] args ){
        int[] arr={42,55,33,32,48,12,10};
        int max1=arr[0];
        int max2=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max1<arr[i]) {

                max1 = arr[i];
            }
            if(max2<arr[i]&& arr[i]!=max1){
                max2=arr[i];
            }
        }
        System.out.println(max2);
    }
}
