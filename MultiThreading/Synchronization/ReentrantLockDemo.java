import java.util.concurrent.locks.ReentrantLock;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Worker implements Runnable{
    String name;
    ReentrantLock re;
    public Worker(ReentrantLock rl,String n){
        re = rl;
        name = n;
    }
    @Override public void run(){
        boolean done = false;
        while(!done){
            boolean ans = re.tryLock();
            if(ans){
                try{
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Task name - "+name+" outer lock aquired at "+ft.format(d)+" doing outer work");
                    Thread.sleep(1000);
                    re.lock();
                    try{
                        d = new Date();
                        ft = new SimpleDateFormat("hh:mm:ss");
                        System.out.println("Task name - "+name+" inner lock acquired at "+ft.format(d)+" doing inner work");
                        Thread.sleep(1000);

                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                    finally{
                        System.out.println("Task name - "+name+ " releasing inner lock ");
                        re.unlock();

                    }
                    System.out.println("Lock hold count - "+re.getHoldCount());
                    System.out.println("Task name - "+name+" work done");
                    done = true;
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                finally{
                    System.out.println("Task name - "+name+" releasing outer lock ");
                    re.unlock();
                    System.out.println("Task name - "+name+"lock  Hold count - "+re.getHoldCount());
                }
            }
            else{
                System.out.println("Task name- "+name+" Waiting for lock ");
                try{
                    Thread.sleep(1000);

                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }

        }
    }
}
public class ReentrantLockDemo{
    public static void main(String[] args) {
        ReentrantLock rel = new ReentrantLock();
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Runnable w1 = new Worker(rel,"job1");
        Runnable w2 = new Worker(rel,"job2");
        Runnable w3 = new Worker(rel,"job3");
        Runnable w4 = new Worker(rel,"job4");
        pool.execute(w1);
        pool.execute(w2);
        pool.execute(w3);
        pool.execute(w4);
        pool.shutdown();
    }
}