import java.awt.*;

public class AwtExample extends Frame {
    AwtExample() {
        Button b = new Button("Click Me!");
        b.setBounds(30, 100, 80, 30);
        add(b);
        setSize(300, 300);
        setTitle("AWT EXAMPLE");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AwtExample();

    }
}