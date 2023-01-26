package bilet29;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.put("ABC");
        myStack.put("BCD");
        myStack.put("DEF");
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
