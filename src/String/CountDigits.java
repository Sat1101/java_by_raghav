package String;

import java.util.Scanner;

public class CountDigits {
    static void main(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        System.out.println(s.length());
    }
}
