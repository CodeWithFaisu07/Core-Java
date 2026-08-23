package collectionframework;

import java.util.LinkedList;
import java.util.Stack;

public class StackDemo_01 {
    static void main() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        int removeElement = stack.pop();
        System.out.println(stack);
        //if ou don't want to remove you just want to see which is last element then you can use peek();
        Integer peek = stack.peek();
        System.out.println(peek);
        // we can cheak the Size of Stack
        System.out.println(stack.isEmpty());

        System.out.println(stack.size());
        int search = stack.search(3);
        System.out.println(search);
        //Search the index from top

        // Even we can use Vectors and ArrayList or LinklistMethod "s method

        // or we can also create a linkedList who behave like a stack
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.addLast(1);
        l1.addLast(1);
        l1.addLast(1);
        l1.addLast(1); // add last is Equivalent to Push
        l1.getLast();//Equals to peek
        l1.removeLast();//Equals to pop
    }
}
