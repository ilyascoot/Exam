package bilet15;

import java.util.ArrayDeque;
import java.util.Stack;

public class Main {

    public static Stack<Integer> splitStack(Stack<Integer> data){
        Stack<Integer> result = new Stack<>();
        ArrayDeque<Integer> integerArrayDeque = new ArrayDeque<>();
        while (!data.isEmpty()){
            int number = data.pop();
            if (number < 0){
                result.add(number);
            }
            else {
                integerArrayDeque.add(number);
            }
        }
        while (!integerArrayDeque.isEmpty()){
            result.add(integerArrayDeque.poll());
        }
        return result;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(-1);
        stack.add(-3);
        stack.add(4);
        stack.add(-5);
        stack.add(6);
        System.out.println(splitStack(stack));
    }
}
