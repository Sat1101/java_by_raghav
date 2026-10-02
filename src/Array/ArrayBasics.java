package Array;

public class ArrayBasics {
    public static void main(String[] args){
        int[] arr={23,56,4,76};
        //indexing
        System.out.println(arr[2]);
        //initialisation
        int[] arr1= new int[4];
        System.out.println(arr1[3]);
        //printing
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
