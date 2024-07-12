import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class LockTest{
    public static void main(String[] args) {
        TestResource test = new TestResource();//instance to invoke the methods
        Thread thread[] = new Thread[10];//ten threads
        for(int i=0;i<5;i++){
            thread[i] = new Thread(new DisplayJob(test));//5 for displaying
        }
        for(int i=5;i<10;i++){
            thread[i] = new Thread(new ReadJob(test));//5 for reading
        }
        for(int i=0;i<10;i++){
            thread[i].start();
        }
    }
}
class DisplayJob implements Runnable{
    private TestResource test;
    DisplayJob(TestResource tr){
        test = tr;
    }
    @Override public void run(){
        System.out.println("Displaying Job");
        test.displayRecord(new Object());//method invoked using instance after creating a thread
    }

}
class ReadJob implements Runnable{
    private TestResource test;
    ReadJob(TestResource tr){
        test = tr;
    }
    @Override public void run(){
        System.out.println("reading Job");
        test.readRecord(new Object());//method invoked using instance after creating thread
    }

}
class TestResource{
    private final Lock displayQueueLock = new ReentrantLock(true);//setting fairness cause adiitional overhead and decreases performance
    private final Lock readQueueLock = new ReentrantLock(true);// so when performance is considered using fairness might not be the appropriate way.
    public void displayRecord(Object document){
        final Lock displayLock = this.displayQueueLock;// lock for instance
        displayLock.lock();//acquiring lock
        try{
            Long duration = (long) (Math.random()*10000);
            System.out.println(Thread.currentThread().getName()+" Test Resource display a job during "+duration/1000+"sec "+"Time -"+new Date());
            Thread.sleep(duration);

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("The document has been displayed,"+Thread.currentThread().getName());
            displayLock.unlock();// release a lock after executing required part
        }

    }
    public void readRecord(Object document)
    {
        final Lock readQueueLock = this.readQueueLock;
        readQueueLock.lock();
        try
          {
             Long duration =
                       (long) (Math.random() * 10000);
             System.out.println
             (Thread.currentThread().getName()
             + ": TestResource: reading a Job during " +
             (duration / 1000) + " seconds :: Time - " +
             new Date());
             Thread.sleep(duration);
          }
          catch (InterruptedException e)
          {
             e.printStackTrace();
          }
          finally
          {
             System.out.printf("%s: The document has"+
             " been read\n", Thread.currentThread().getName());
             readQueueLock.unlock();
          }
    }
} 
