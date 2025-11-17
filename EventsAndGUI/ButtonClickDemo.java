import java.awt.*;
import java.awt.event.*;

public class ButtonClickDemo {
    public static void main(String[] args) {

        Frame f = new Frame("Button Event Example");
        Button b = new Button("Click Me");

        b.setBounds(100, 100, 100, 50);

        // STEP 1: Register listener with source
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button is clicked!");
            }
        });

        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
