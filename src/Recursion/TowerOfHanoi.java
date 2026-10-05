package Recursion;

public class TowerOfHanoi {
    static void main() {
        Hanoi(3,'A','B','C');
    }

    static void Hanoi(int n,char a,char b,char c) {
        //base case
        if(n==0)return;
        //a to b via c
        Hanoi(n-1,a,c,b);
        // largest from A to C
        System.out.println(a+"->"+c);
        //b to c via a
        Hanoi(n-1,b,a,c);

    }
}
