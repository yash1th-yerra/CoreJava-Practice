import java.awt.*;
import java.awt.event.*;

public class ButtonExample extends Frame {
    public static void main(String[] args) {
        Frame f = new Frame("Button Example");
        TextField tf = new TextField();
        tf.setBounds(50, 50, 150, 20);
        Button b = new Button("Click Me");
        b.setBounds(50, 100, 60, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("This is Button Example in Java AWT");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);

    }

}