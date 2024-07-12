import java.awt.*;
import java.awt.event.*;

public class ListExample {
    ListExample() {
        Frame f = new Frame("Choice Example");
        final Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(800, 100);
        Button b = new Button("Show");
        b.setBounds(200, 100, 50, 20);
        final List l1 = new List(4, false);
        l1.setBounds(100, 100, 70, 70);
        l1.add("C");
        l1.add("C++");
        l1.add("Java");
        l1.add("PHP");
        final List l2 = new List(4, true);
        l2.setBounds(100, 200, 70, 70);
        l2.add("Turbo C++");
        l2.add("Spring");
        l2.add("Hibernate");
        l2.add("Hibernate");
        l2.add("CodeIgniter");
        f.add(l1);
        f.add(l2);
        f.add(b);
        f.add(label);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Programming Language selected is: " + l1.getItem(l1.getSelectedIndex());
                data += ", FrameWork selected: ";
                for (String name : l2.getSelectedItems()) {
                    data += name + " ";
                }
                label.setText(data);
            }

        });

    }

    public static void main(String[] args) {
        new ListExample();

    }
}