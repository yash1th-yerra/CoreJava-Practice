public class SleepDemo extends Thread{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                Thread.sleep(2000);
                //Thread.sleep(-2000); throws IllegalArgumentException
                System.out.println(i);
                
            }
            
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        SleepDemo thread = new SleepDemo();
        thread.start();
        //thread.interrupt(); throws Interrupted Exception.
    }
}