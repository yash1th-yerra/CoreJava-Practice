import java.awt.*;

public class ToolkitExample {
    public static void main(String[] args) {
        Toolkit t = Toolkit.getDefaultToolkit();
        System.out.println("Screen Resolution: " + t.getScreenResolution());
        Dimension d = t.getScreenSize();
        System.out.println("Width: " + d.width);
        System.out.println("Height: " + d.height);

    }

}