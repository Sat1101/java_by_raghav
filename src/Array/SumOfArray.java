package Array;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] arr={23,45,67,25,47,12};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
