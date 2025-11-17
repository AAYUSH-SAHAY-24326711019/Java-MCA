import java.awt.*;
import java.awt.event.*;

public class MouseDemo extends Frame implements MouseListener {

    public MouseDemo() {
        addMouseListener(this);
        setSize(400, 400);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }

    public static void main(String[] args) {
        new MouseDemo();
    }
}
