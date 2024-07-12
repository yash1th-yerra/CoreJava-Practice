import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;
  public class AtomicDemo2{
    public static void main(String[] args) {
        AtomicInteger counter  = new AtomicInteger(0);
        Runnable incrementTask = () -> {
            for(int i=0 ;i<1000;i++){
                counter.incrementAndGet();
            }
        };
        Thread thread1 = new Thread(incrementTask);
        Thread thread2 = new Thread(incrementTask);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Counter value: " + counter.get());

        AtomicBoolean flag = new AtomicBoolean(false);

        Runnable toggleTask = () -> {
            flag.compareAndSet(false, true); // Atomic compare-and-set operation
        };

         Thread thread3 = new Thread(toggleTask);
        Thread thread4 = new Thread(toggleTask);
        thread3.start();
        thread4.start();
        try{
            thread3.join();
            thread4.join();
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    System.out.println("Flag value: " + flag.get());
    }
}
