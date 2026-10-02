package Array;

import java.util.Scanner;

public class PrintNegative {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        System.out.print("Enter elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
