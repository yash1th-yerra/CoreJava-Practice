import java.io.*;
import java.util.*;
public class StackDemo{
    static void stack_push(Stack<Integer> stack){
        for(int i=0;i<5;i++){
            stack.push(i);
            System.out.println("pushed Element:"+i);
        }
        System.out.println(stack);
    }
    static void stack_pop(Stack<Integer> stack){
        Integer element = (Integer)stack.pop();
        System.out.println("Popped element is "+element);
    }
    static void stack_search(Stack<Integer> stack,int element){
        Integer pos = (Integer)stack.search(element);
        if(pos==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at "+pos);
        }

    }
    static void stack_peek(Stack<Integer> stack){
        Integer ele = (Integer)stack.peek();
        System.out.println("Element at top of stack is:"+ele);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        stack_push(st);
        stack_pop(st);
        stack_peek(st);
        stack_search(st,3);
    }
}
