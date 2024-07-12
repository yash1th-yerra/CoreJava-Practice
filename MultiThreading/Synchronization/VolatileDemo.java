/*class VolatileData {
    private volatile boolean flag = false;

    public void toggleFlag() {
        flag = !flag;
    }

    public boolean isFlag() {
        return flag;
    }
}

class WriterThread extends Thread {
    private VolatileData data;

    public WriterThread(VolatileData data) {
        this.data = data;
    }

    @Override
    public void run() {
        System.out.println("Writer thread started.");
        try {
            Thread.sleep(1000); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        data.toggleFlag(); // Set flag to true
        System.out.println("Flag set to true.");
    }
}

class ReaderThread extends Thread {
    private VolatileData data;

    public ReaderThread(VolatileData data) {
        this.data = data;
    }

    @Override
    public void run() {
        System.out.println("Reader thread started.");
        while (!data.isFlag()) {
            // Spin until flag becomes true
        }
        System.out.println("Flag is now true.");
    }
}

public class VolatileDemo {
    public static void main(String[] args) {
        VolatileData data = new VolatileData();

        WriterThread writerThread = new WriterThread(data);
        ReaderThread readerThread = new ReaderThread(data);

        writerThread.start();
        readerThread.start();
    }
}*/
public class VolatileDemo{
    private volatile boolean flag = false; //volatile makes data consistent here by making cache conherent.
    public void toggleFlag(){
        flag =!flag;
    }
    public boolean isFlag(){
        return flag;
    }
    public static void main(String[] args) {
        VolatileDemo demo = new VolatileDemo();
        Thread writerThread = new Thread(() -> {
            System.out.println("Writer Thread Started");
            try{
                Thread.sleep(1000);

            }
            catch(Exception e){
                e.printStackTrace();
            }
            demo.toggleFlag();
            System.out.println("Flag is set to True");
        });
        Thread ReaderThread = new Thread(() -> {
            System.out.println("Reader Thread Started");
            while(!demo.isFlag()){

            }
            System.out.println("Flag is now true");
        });
        writerThread.start();
        ReaderThread.start();
    }

}





