
public class MainThread extends Thread{
    @Override public void run(){
        try{
            System.out.println(Thread.currentThread().getName());
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("OG");
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.setPriority(7);
        System.out.println(t.getPriority());
        Thread ct = new Thread();
        ct.setName("Child");
        System.out.println(ct.getName());
        System.out.println(ct.getPriority());
        ct.start();
    }
}
