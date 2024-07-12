import java.awt.*;

public class CanvasExample {
    public CanvasExample() {
        Frame f = new Frame("Canvas Example");
        f.add(new MyCanvas());
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new CanvasExample();

    }

}

class MyCanvas extends Canvas {

    public MyCanvas() {
        setBackground(Color.GRAY);
        setSize(300, 200);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(75, 75, 100, 75);
    }
}