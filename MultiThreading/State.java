class thread implements Runnable{
    public void run(){
        try{
            Thread.sleep(1500);

        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("State of thread1 while it called join method on thread 2: "+State.thread1.getState());
        try{
            Thread.sleep(200);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class State implements Runnable{
        public static Thread thread1;
        public static State obj;
        public static void main(String[] args) {
            obj = new State();
            thread1 = new Thread(obj);
            System.out.println("State of thread: "+thread1.getState());
            thread1.start();
            System.out.println("State of thread: "+thread1.getState());

        }
        public void run(){
            thread myThread = new thread();
            Thread thread2 = new Thread(myThread);
            System.out.println("Thread2 state:"+thread2.getState());
            thread2.start();
            System.out.println("thread2 state: "+thread2.getState());
            try{
                Thread.sleep(200);

            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("thread2 state: "+thread2.getState());
            try{
                thread2.join();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("thread2 state: "+thread2.getState());
        }
 }