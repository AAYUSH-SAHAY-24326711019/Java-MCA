//this is the demo code for the applet class
//already call a paint method

import java.awt.Graphics;

import java.applet.*;

@SuppressWarnings("removal")
public class program1 extends Applet{

    @Override
    public void paint(Graphics g){
        g.drawString("Hello Java", 10, 100);
    }
}