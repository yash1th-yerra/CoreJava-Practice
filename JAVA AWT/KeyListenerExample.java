import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample extends Frame implements KeyListener {
    Label l;
    TextArea t;

    KeyListenerExample() {
        l = new Label();
        l.setBounds(20, 50, 100, 20);
        t = new TextArea();
        t.setBounds(20, 80, 300, 300);
        t.addKeyListener(this);
        add(l);
        add(t);
        setSize(500, 500);
        setVisible(true);
        setLayout(null);
    }

    public void keyPressed(KeyEvent e) {
        // l.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        // l.setText("Key Realeased");
        String text = t.getText();    
// splitting the string in words  
        String words[] = text.split ("\\s");    
// printing the number of words and characters of the string   
        l.setText ("Words: " + words.length + " Characters:" + text.length());  
    }

    public void keyTyped(KeyEvent e) {
        // l.setText("Key Typed");
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
