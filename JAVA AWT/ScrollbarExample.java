import java.awt.*;
import java.awt.event.*;

public class ScrollbarExample {
    ScrollbarExample() {
        Frame f = new Frame("Scrollbar Example");
        final Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(300, 100);
        final Scrollbar s = new Scrollbar();
        s.setBounds(100, 100, 50, 100);
        f.add(s);
        f.add(label);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);
        s.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Vertical Scrollbar is:" +s.getValue());

            }
        });
    }

    public static void main(String[] args) {
        new ScrollbarExample();
    }

}