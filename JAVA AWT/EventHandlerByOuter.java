import java.awt.*;
import java.awt.event.*;

public class EventHandlerByOuter extends Frame {
    TextField tf;

    EventHandlerByOuter() {
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        Button b = new Button("Click Me!");
        b.setBounds(100, 120, 80, 30);
        Outer o = new Outer(this);
        b.addActionListener(o);
        add(b);
        add(tf);
        setLayout(null);
        setVisible(true);
        setSize(300, 300);

    }

    public static void main(String[] args) {
        new EventHandlerByOuter();
        }
}

class Outer implements ActionListener{
    EventHandlerByOuter obj;
    Outer(EventHandlerByOuter obj){
        this.obj = obj;
    }
    public void actionPerformed(ActionEvent e){
        obj.tf.setText("Welcome Man");
    }
}