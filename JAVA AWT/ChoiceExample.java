import java.awt.*;
import java.awt.event.*;

public class ChoiceExample {
    ChoiceExample(){
        Frame f = new Frame("Choice Example");
        final Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);
        Button b = new Button("Show");
        b.setBounds(200,100,50,20);
        final Choice c = new Choice();
        c.setBounds(100,100,75,75);
        c.add("C");
        c.add("C++");
        c.add("Java");
        c.add("PHP");
        c.add("JavaScript");
        f.add(c);
        f.add(b);
        f.add(label);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String data = "Programming Language selected is: "+c.getItem(c.getSelectedIndex());
                label.setText(data);
            }

        });

    }

    public static void main(String[] args) {
        new ChoiceExample();

    }
}