class Sender{
    public void send(String msg){
        System.out.println("\nSending    "+msg);
        try{
            Thread.sleep(500);
        }
        catch(Exception e ){
            e.printStackTrace();
        }
        System.out.println("\n" + msg + "        Sent\n");
    }

}
class ThreadSend extends Thread{
    private String msg;
    Sender sender;
    public ThreadSend(Sender s,String m){
        this.sender = s;
        this.msg = m;
    }
    public void run(){
        synchronized(sender){
            sender.send(msg);
        }
    }
}
public class SynchronizedMethodDemo{
    public static void main(String[] args) {
        Sender sender = new Sender();
        ThreadSend S1 = new ThreadSend(sender,"HI");
        ThreadSend S2 = new ThreadSend(sender,"HI");
        
          
          S1.start();
          S2.start();
   
          // wait for threads to end
          try {
              S1.join();
              S2.join();
          }
          catch (Exception e) {
              System.out.println("Interrupted");
          }
    }
}