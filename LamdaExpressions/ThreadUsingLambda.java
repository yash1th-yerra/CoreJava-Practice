public class ThreadUsingLambda{
    public static void main(String[] args) {
        Runnable myThread = ()->{
            System.out.println("Running Thread is "+Thread.currentThread()  .getName());
        };
        Thread thread = new Thread(myThread);
        Thread thread2 = new Thread(myThread);
        thread.start();
        thread2.start();
        try{
            thread.join(200);
            thread2.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}