import java.awt.*;
import java.awt.event.*;

public class TextAreaEventExample extends Frame implements ActionListener {
    Label l1, l2;
    TextArea t;
    Button b;

    TextAreaEventExample() {
        l1 = new Label();
        l1.setBounds(50, 50, 100, 30);
        l2 = new Label();
        l2.setBounds(160, 50, 100, 30);
        t = new TextArea();
        t.setBounds(20, 100, 300, 300);
        b = new Button("Count Words");
        b.setBounds(100, 400, 100, 30);
        b.addActionListener(this);
        add(l1);
        add(l2);
        add(t);
        add(b);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String text = t.getText();
        String words[] = text.split("\\s");
        l1.setText("Words: " + words.length);
        l2.setText("characters: " + text.length());
    }

    public static void main(String[] args) {
        new TextAreaEventExample();

    }

}