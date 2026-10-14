package Stacks;

import java.util.Stack;

public class BasicStlOfStacks {
    static void main() {
        Stack<String> st=new Stack<>();
        st.pop(); // underflow
        st.push("Satyam");
        st.push("Ayushi");
        st.push("Vansh");
        st.push("Aryan");
        st.push("yash");
        System.out.println(st.size());
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
    }
}
