import java.awt.*;
import java.awt.event.*;

public class LabelEventExample extends Frame implements ActionListener {
    TextField tf;
    Label l;
    Button b;

    LabelEventExample() {
        tf = new TextField();
        tf.setBounds(50, 50, 150, 20);
        l = new Label();
        l.setBounds(50, 100, 250, 20);
        b = new Button("Find IP");
        b.setBounds(50, 150, 60, 30);
        b.addActionListener(this);
        add(b);
        add(l);
        add(tf);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of " + host + "is:" + ip);

        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }

    public static void main(String[] args) {
        new LabelEventExample();
    }

}