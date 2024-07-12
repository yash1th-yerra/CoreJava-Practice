

class Line {
    synchronized public void getLine(){
        for(int i=0;i<3;i++){
            System.out.println(i);
        }
        try{
            Thread.sleep(400);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}



class Train extends Thread{
    Line line;
    public Train(Line line){
        this.line = line;
    }
    @Override public void run(){
        line.getLine();
    }

}
public class SyncMethodDemo{
    public static void main(String[] args) {
        Line line = new Line();
        Train train1 = new Train(line);
        Train train2 = new Train(line);
        train1.start();
        train2.start();
        
    }
}