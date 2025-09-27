//program to make an applet gui program to add 2 numbers

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

@SuppressWarnings("removal")
public class program3 extends Applet implements ActionListener{
    //make 3 text fields to take input and show output respectively

    TextField t1= new TextField(10);
    TextField t2= new TextField(10);

    //add the 3 labels
    Label l1 = new Label("Enter No.");
    Label l2 = new Label("Result (Even / Odd / 0)");

    //add a button , that on click will provide the sum

    Button b = new Button("Check");

    public void init(){
        add(l1); add(t1);
        add(l2); add(t2);
        add(b);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==b){
            int n1 = Integer.parseInt(t1.getText());
            if(n1%2!=0){
                t2.setText("Odd");
            }else{
                if(n1==0){
                    t2.setText("Neither Even nor odd");
                }
                else{
                    t2.setText("Even");
                }
            }
            
        
        }
    }
}

