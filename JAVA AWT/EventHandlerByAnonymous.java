import java.awt.*;
import java.awt.event.*;

public class EventHandlerByAnonymous extends Frame {
    TextField tf;

    EventHandlerByAnonymous() {
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        Button b = new Button("Click Me!");
        b.setBounds(100, 120, 80, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome Man");
            }
        });
        add(b);
        add(tf);
        setLayout(null);
        setVisible(true);
        setSize(300, 300);

    }

    public static void main(String[] args) {
        new EventHandlerByAnonymous();
    }
}
