class ThreadTest extends Thread{
    public void run(){
        try{
            System.out.println("Thread "+Thread.currentThread().getId()+" is running"
            );
            System.out.println(Thread.currentThread().getName());
            //ThreadGroup tg = Thread.currentThread().getThreadGroup();
           // System.out.println(tg);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class StartDemo{
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            ThreadTest th = new ThreadTest();
            th.run();
            th.run();//multiple invocation is possible cause it is a normal function call
            
        }
        for(int i=0;i<5;i++){
            ThreadTest th = new ThreadTest();
            th.start();
            //th.start(); // it will send an illegalstateExcpetion cause multiple invocation of start() is not possible
        }
        
    }
}