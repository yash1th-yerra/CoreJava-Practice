import java.awt.*;
import java.awt.event.*;

public class ItemListenerExample implements ItemListener {
    Checkbox cb1, cb2;
    Label l;

    ItemListenerExample() {
        Frame f = new Frame("ItemListener Example");
        l = new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400, 100);
        cb1 = new Checkbox("C++");
        cb1.setBounds(100, 100, 50, 50);
        cb2 = new Checkbox("Java");
        cb2.setBounds(100, 150, 50, 50);
        f.add(cb1);
        f.add(cb2);
        f.add(l);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == cb1) {
            l.setText("C++ : " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
        }
        if (e.getSource() == cb2) {
            l.setText("Java : " + (e.getStateChange() == 1 ? "Checked" : "unchecked"));
        }
    }

    public static void main(String[] args) {
        new ItemListenerExample();
    }

}