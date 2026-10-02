package Array;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        System.out.print("Enter elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
             arr[i] =sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
