import java.awt.*;
import java.awt.event.*;

public class CheckboxGroupExample {
    CheckboxGroupExample(){
        Frame f = new Frame("CheckboxGroup Example");
        final Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("C++",cbg,false);
        cb1.setBounds(100,100,50,50);
        Checkbox cb2 = new Checkbox("Java",cbg,false);
        cb2.setBounds(100,150,50,50);
        f.add(cb1);
        f.add(cb2);
        f.add(label);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        cb1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                label.setText("C++ checked");
            }

        });
        cb2.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                label.setText("Java checked");
            }

        });



    }
    public static void main(String[] args){
        new CheckboxGroupExample();
    }
}