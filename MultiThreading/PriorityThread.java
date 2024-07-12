public class PriorityThread extends Thread{
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        PriorityThread t3 = new PriorityThread();
        t1.setPriority(MAX_PRIORITY);
        System.out.println("t1 "+t1.getPriority());
        t2.setPriority(MIN_PRIORITY);
        t3.setPriority(NORM_PRIORITY);
        System.out.println("t2 "+t2.getPriority());
        System.out.println("t3 "+t3.getPriority());
        t1.start();
        t2.start();
        t3.start();


    }
}