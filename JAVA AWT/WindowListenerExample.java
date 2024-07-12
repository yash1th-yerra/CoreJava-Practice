import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerExample extends Frame implements WindowListener {
    WindowListenerExample() {
        addWindowListener(this);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new WindowListenerExample();
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closedd");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Window closing");
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Window conified");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window deactivated");
    }

    public void windowOpened(WindowEvent e) {
        System.out.println("opened");
    }
}