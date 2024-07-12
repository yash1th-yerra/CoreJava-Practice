import java.util.*;
class MyThread extends Thread{
    private volatile int count=0;
    @Override public void run(){
        for (int i = 1; i <= 5; i++) {
            
            
            try{
                Thread.sleep(1000);
                count++;
                System.out.println(Thread.currentThread().getName()+"  :  "+count);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public int getCount(){
        return this.count;
    }
}
public class DataConsisTest {
    public static void main(String[] args) throws InterruptedException{
        MyThread t = new MyThread();
        Thread t1 = new Thread(t,"t1");
        t1.start();
        Thread t2 = new Thread(t,"t2");
        t2.start();
        
        t1.join();
        t2.join();
        System.out.println("Count : "+t.getCount());
    }
}