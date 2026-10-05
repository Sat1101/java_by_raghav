package Recursion;

public class PreInPost {
    static void main() {
        pip(2);
    }

    static void pip(int n) {
        if(n==0)return;
        System.out.print("pre"+n+" ");//pre
        pip(n-1);
        System.out.print("in"+n+" ");//in
        pip(n-1);
        System.out.print("post"+n+" ");//post
    }
}
