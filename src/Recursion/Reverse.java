package Recursion;

import java.util.Scanner;

public class Reverse {
    static void main() {
        Scanner sb=new Scanner(System.in);
        int n=sb.nextInt();
        System.out.println(rev(n,0));
    }

    static int  rev(int n,int r) {
        if (n==0){

            return r;
        }
        return rev(n/10,r*10+n%10);

    }
}
