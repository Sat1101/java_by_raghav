package String;

public class PalindromeString {
    static void main() {
        String str="madam";
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) System.out.print("not palindrome");
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}
