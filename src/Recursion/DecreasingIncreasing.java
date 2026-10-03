package Recursion;

import java.util.Scanner;

public class DecreasingIncreasing {
    static void main() {
        Scanner sb=new Scanner(System.in);
        int n=sb.nextInt();
        print(n);
    }

    static void print(int n) {
        if(n==0)return;
        System.out.println(n);
        print(n-1);
        if(n!=1)System.out.println(n);
    }
}
