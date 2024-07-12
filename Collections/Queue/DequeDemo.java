import java.util.*;
public class DequeDemo{
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(1);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println();
        deque.add(1);
        deque.add(2);
        deque.addFirst(3);
        deque.addLast(4);
        deque.push(5);
        deque.push(6);
        deque.offer(7);
        deque.offerFirst(8);
        System.out.println(deque);
        System.out.println(deque.pop());
        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        Iterator<Integer> it = deque.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        Iterator<Integer> it2 = deque.descendingIterator();
        System.out.println();
        while(it2.hasNext()){
            System.out.print(it2.next()+" ");
        }
    }
}