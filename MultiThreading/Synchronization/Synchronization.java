class Multiples{
    synchronized public void multiples(int n){
       /*synchronized(this)*/ for(int i=1;i<=5;i++){
            System.out.println(i*n);
            try{
                Thread.sleep(500);

            }
            catch(Exception e ){
                e.printStackTrace();
            }
        }
    }
}
class Thread1 extends Thread{
    Multiples mu;
    public Thread1 (Multiples mu){
        this.mu = mu;

    }
    public void run(){
        try{
            mu.multiples(2);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class Thread2 implements Runnable{
    Multiples mu;
    public Thread2 (Multiples mu){
        this.mu = mu;
    }
    public void run(){
        try{
            mu.multiples(3);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class Synchronization{
    public static void main(String[] args) {
        Multiples m = new Multiples();
        Thread1 t1 = new Thread1(m);
        Thread t2 = new Thread(new Thread2(m));
        t1.start();
        t2.start();
    }
}