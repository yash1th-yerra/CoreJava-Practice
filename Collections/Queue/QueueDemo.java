import java.util.*;
public class QueueDemo{
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println("Queue: "+queue+"\n");
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.size());
        queue.offer(1);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        Iterator<Integer> it = queue.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        

    }
}