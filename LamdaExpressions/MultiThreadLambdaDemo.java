import java.util.Random;
import java.util.ArrayList;
class RandomPlayer{
    public void gamePlayer(String gameName)throws InterruptedException {
        System.out.println(gameName+" is started");
        Thread.sleep(500);
        System.out.println(gameName+ " is ended ");
    }
    public void musicPlayer(String musicName) throws InterruptedException{
        System.out.println(musicName+ " is started");
        Thread.sleep(500);
        System.out.println(musicName+ " is ended ");
    }

}
public class MultiThreadLambdaDemo{
    public static void main(String[] args) {
        RandomPlayer rp = new RandomPlayer();
        Random random = new Random();
        ArrayList<String> gl = new ArrayList<String>();
        gl.add("GTA-V");
        gl.add("BGMI");
        gl.add("Fornite");
        ArrayList<String> ml = new ArrayList<String>();
        ml.add("GoldenHour");
        ml.add("Bones");
        ml.add("Interstellar");
        Runnable gameplay = ()->{ 
            try{
                rp.gamePlayer(gl.get(random.nextInt(gl.size())));
            }
            catch(Exception e){
                e.getMessage();
            }   
        };
        Runnable musicplay = ()->{ 
            try{
                rp.gamePlayer(ml.get(random.nextInt(ml.size())));
            }
            catch(Exception e){
                e.getMessage();
            }   
        };
        Thread game = new Thread(gameplay);
        Thread music = new Thread(musicplay);
        game.start();
        music.start();
    }
}