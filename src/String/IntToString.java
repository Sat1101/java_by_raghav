package String;

import java.util.Scanner;

public class IntToString {
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        System.out.println(Integer.toString(n));
        s=s+ n ;
        System.out.println(s);

    }
}
