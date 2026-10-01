package String;

public class StringBuilders {
    static void main(){
        StringBuilder s=new StringBuilder("Satyam");
        System.out.println(s.length()+" "+s.capacity());
        System.out.println(s);
        s.append("Agrawal");
        System.out.println(s);
        s.setCharAt(1,'o');
        System.out.println(s);
        String t=s.toString();
        System.out.println(t);
    }
}
