public class LamdaThreadDemo{
    public static void main(String[] args) {
        Thread myThread = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
            Thread.currentThread().setName("OG");
            System.out.println(Thread.currentThread().getName()+" name changed and running.......");
        });
        myThread.start();
    }
}