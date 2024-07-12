import java.lang.*;
public class Thread1 extends Thread{
    public void run(){
        try{
            System.out.println("Thread Execution");
            System.out.println(Thread.currentThread().getName());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        Thread1 t3 = new Thread1();
        System.out.println("Priority of thread1 : "+t1.getPriority());
        System.out.println("Priority of thread2 : "+t2.getPriority());
        System.out.println("Priority of thread3 : "+t3.getPriority());
        t1.setPriority(2);
        t2.setPriority(4);
        t3.setPriority(8);
        System.out.println("Priority of thread1 : "+t1.getPriority());
        System.out.println("Priority of thread2 : "+t2.getPriority());
        System.out.println("Priority of thread3 : "+t3.getPriority());
        System.out.println(Thread.currentThread().getName());
        t1.start();
        t2.start();
        t3.start();
        

    }
}