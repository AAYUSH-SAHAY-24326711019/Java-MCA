import java.awt.*;
import java.awt.event.*;

public class MouseAdapterDemo {
    public static void main(String[] args) {

        Frame f = new Frame("Adapter Example");

        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked using Adapter!");
            }
        });

        f.setSize(300, 300);
        f.setVisible(true);
    }
}
