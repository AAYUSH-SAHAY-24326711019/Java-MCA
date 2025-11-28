import java.awt.*; 
import java.awt.event.*; 
class MyFrame extends Frame implements ActionListener { 
Button b; 
MyFrame() { 
b = new Button("Click Me"); 
add(b); 
b.addActionListener(this);   
setSize(300,200); 
setVisible(true); 
} 
// Register the listener 
public void actionPerformed(ActionEvent e) { 
System.out.println("Button was clicked!"); 
} 
public static void main(String[] args) { 
new MyFrame(); 
}
}