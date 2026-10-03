package Recursion;

import java.util.Scanner;

public class Factorial {
    static void main() {
        Scanner sb=new Scanner(System.in);
        int n=sb.nextInt();

        System.out.print(fact(n));

    }

    static int fact(int n) {
        if (n==0 || n==1)return 1;
        int ans=n*fact(n-1);
        return ans;

    }
}
