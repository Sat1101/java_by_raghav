package Recursion;

public class GlobalVariables {
    static int x=10;

    static void main() {
        fun();

        System.out.println(x);
    }
    static void fun(){
        x=20;
    }
}
