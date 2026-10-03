package Recursion;

import java.util.Scanner;

public class OneToN {
// 2 parameter approach
    //    static void main() {
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        print(1,n);
//    }
//
//    static void print(int x,int n) {
//        if(x>n)return;
//        System.out.println(x);
//        print(x+1,n);
//    }

// 1 parameter approach
    static void main() {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }

    static void print(int n) {
        if(n==0)return;
        print(n-1);
        System.out.println(n);

    }
}
