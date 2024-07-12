import java.awt.*;

public class ToolkitIcon {
    ToolkitIcon() {
        Frame f = new Frame();
        Image icon = Toolkit.getDefaultToolkit().getImage("E:\\key.jpg");
        f.setIconImage(icon);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ToolkitExample();

    }
}