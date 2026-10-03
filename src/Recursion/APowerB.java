package Recursion;

public class APowerB {
    static void main() {

        System.out.println(power(2,5));
    }

//    static int power(int a,int b) {
//        if(b==0)return 1;
//        int ans=a*power(a,b-1);
//        return ans;
//
//    }



    static int power(int a,int b) {
        if(b==0)return 1;
        int call=power(a,b/2);
        if(b%2==0)return call*call;
        else return call*call*a;
    }
}
