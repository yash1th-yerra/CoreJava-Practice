import java.awt.*;

public class PanelExample {
    PanelExample() {
        Frame f = new Frame("Panel EXample");
        Panel panel = new Panel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(Color.gray);
        Button b1 = new Button("click 1");
        b1.setBounds(50, 100, 80, 30);
        b1.setBackground(Color.yellow);
        Button b2 = new Button("Click 2");
        b2.setBounds(100, 200, 80, 30);
        b2.setBackground(Color.green);
        panel.add(b1);
        panel.add(b2);
        f.add(panel);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new PanelExample();
    }
}