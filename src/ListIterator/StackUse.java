package ListIterator;

import java.util.Stack;

public class StackUse {

    public static void main(String[] args) {

        Stack<String> st = new Stack<>();

        st.push("soda");
        st.push("water");
        st.push("lemonade");

        print(st);

        st.pop();
        print(st);



    }
    private static void print(Stack<String> s){
        if(s.isEmpty()){
            System.out.println("out of stock");
        } else
            System.out.println(s +"last available");
    }
}
