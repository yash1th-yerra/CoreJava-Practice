//MultiThreading
//Multiple Threads Creation in java
class MultiThread extends Thread{
    @Override public void run(){
        try
        {
            System.out.println("Hello from thread");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
class MultiThread2 implements Runnable{
    @Override public void run(){
        try{
            System.out.println("Hello from Runnable");

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class ThreadCreation{
    public static void main(String[] args) {
       for(int i=0;i<10;i++){
            MultiThread mt = new MultiThread();//object creation using thread class
            mt.start();
            Thread mt2 = new Thread(new MultiThread2());//object creation for thread using runnable interface
            mt2.start();
        }
    }
}