import java.awt.*;
import java.awt.event.*;

public class TextFieldDemo {
    public static void main(String[] args) {

        Frame f = new Frame("TextField Event");
        TextField tf = new TextField();
        tf.setBounds(100, 100, 150, 30);

        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed ENTER. Text = " + tf.getText());
            }
        });

        f.add(tf);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
