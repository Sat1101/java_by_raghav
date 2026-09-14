package BinarySearch;

public class BinaryCode {
    public static void main(String[] args){
        int[] arr={-76,-4,1,4,43,56,76,78};
        int tar=4;
        int n =arr.length;
        int i=0,j=n-1;
        while(i<=j){
            int mid =(i+j)/2;
            if(tar==arr[mid]) {
                System.out.println(mid);
                break;
            }

            else if(tar>arr[mid]) i=mid+1;
            else j=mid-1;

        }
        System.out.println("target not found");
    }
}
