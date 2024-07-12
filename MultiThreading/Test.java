import java.lang.*;
class Helper implements Runnable{
    public void run(){
        try{
            System.out.println("Thread is going to sleep for 5000");
            Thread.sleep(5000);

        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class Test implements Runnable{
    public void run(){}
    public static void main(String[] args) {
        Test obj = new Test();
        Helper obj2 = new Helper();
        Thread thread1 = new Thread(obj);
        Thread thread2 = new Thread(obj2);
        thread1.start();
        thread2.start();
        ClassLoader loader = thread1.getContextClassLoader();
        Thread thread3 = new Thread(new Helper());
        System.out.println(Thread.activeCount());
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.getId());
        System.out.println(t.getPriority());
        System.out.println(t.getState());
        thread2 = new Thread(obj2);
        thread2.start();
        thread2.interrupt();
       // System.out.println(thread2.isInterrupted());
       // System.out.println(thread2.isAlive());
       System.out.println("Thread1 is waiting for thread2 to join");
       try{
        thread2.join();
       }
       catch(InterruptedException e){
        e.printStackTrace();
       }
       thread1.setName("OG");
       System.out.println(thread1.getName());
       thread2.yield();
       System.out.println(thread1.toString());
       Thread[] tarray = new Thread[3];
 
       Thread.enumerate(tarray);

       // Display commands
       System.out.println("List of active threads:");
       System.out.printf("[");

       // Looking out using for each loop
       for (Thread thread : tarray) {

           System.out.println(thread);
       }    
       System.out.printf("]\n");
       System.out.println(Thread.getAllStackTraces());
       System.out.println(loader.toString());
       System.out.println(thread1.getDefaultUncaughtExceptionHandler());
       thread2.setUncaughtExceptionHandler(thread1.getDefaultUncaughtExceptionHandler());
       thread2.setContextClassLoader(thread1.getContextClassLoader());
       ThreadGroup tg = thread1.getThreadGroup();
       //System.out.println(tg.toString());
       System.out.println(thread1.getUncaughtExceptionHandler());
       System.out.println("Does thread1 holds Lock? " + thread1.holdsLock(obj2));
       Thread.dumpStack();


    }

}