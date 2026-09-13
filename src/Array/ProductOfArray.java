package Array;

public class ProductOfArray {
    public static void main(String[] args){
        int[] arr={12,53,95,53,76};
        int product=1;
        for(int i=0;i<arr.length;i++){
            product=product*arr[i];
        }
        System.out.println(product);
    }
}
