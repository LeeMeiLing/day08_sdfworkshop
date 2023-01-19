package sg.edu.nus.iss;

import java.util.Iterator;
import java.util.Stack;


public class StackExample {
    
    public static void example(){

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < 10; i++){

            stack.push(i);  // adding element to the stack
            System.out.println(stack);
        }
        

        for(int i = 0; i < 5; i++){

            Integer stackItem = stack.pop();  // removing last-IN element to the stack >> FILO
            System.out.println("Item poped: " + stackItem);
        }

        Integer item = stack.peek(); // see what is the last item on top of the stack
        System.out.println("Item on top of stack: " + item);

        Integer firstItem = stack.firstElement();
        System.out.println("First element in the stack: " + firstItem);

        System.out.println("after stack.firstElement: " + stack);

        Integer idxElement = stack.search(2);
        System.out.println("Index of '2' : " + idxElement);

        Iterator<Integer> its = stack.iterator();
        while(its.hasNext()){
            Integer stackIt = its.next();
            System.out.println("Iterator stack item: " + stackIt);
        }
        

    }
}
