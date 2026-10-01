package String;

public class ReverseSB {
    static void main(){
//        StringBuilder sb=new StringBuilder("Satyam");
//        sb.reverse();
//        int i=0;int j=sb.length()-1;
//        while(i<=j){
//            char temp1=sb.charAt(i);
//            char temp2=sb.charAt(j);
//            sb.setCharAt(i,temp2);
//            sb.setCharAt(j,temp1);
//            i++;
//            j--;
//        }

//        sb.deleteCharAt(2);
//        System.out.println(sb);

        //for String reverse
        String s="Java";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        s=sb.toString();
        System.out.println(s);
    }
}
