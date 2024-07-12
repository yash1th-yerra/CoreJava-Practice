import java.util.*;
public class PriorityQueueDemo{
    public static void main(String[] args){
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(5);
        queue.add(2);
        queue.add(1);
        queue.add(4);
        queue.add(3);
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