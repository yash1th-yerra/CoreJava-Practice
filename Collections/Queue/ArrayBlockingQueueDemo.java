import java.util.concurrent.ArrayBlockingQueue;
public class ArrayBlockingQueueDemo{
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<>(10);
        abq.add(1);
        abq.add(2);
        abq.add(3);
        abq.add(4);
        System.out.println(abq);

    }
}