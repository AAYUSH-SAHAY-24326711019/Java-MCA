package Frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame1 {

	private JFrame frame;
	JLabel nameLabel;
	private JTextField textField1;
	private JTextField textField2;
	private JLabel numLbl1;
	private JLabel numLbl2;
	private JButton ADD_BTN;
	private JButton SUB_BTN;
	private JTextField ansField;
	private JLabel lblAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Show Message");
		btnNewButton.setForeground(new Color(153, 51, 204));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameLabel.setText("Hello - Aayush");
			}
		});
		btnNewButton.setBounds(214, 27, 175, 23);
		frame.getContentPane().add(btnNewButton);
		
		nameLabel = new JLabel("Name :");
		nameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		nameLabel.setBounds(20, 24, 184, 28);
		frame.getContentPane().add(nameLabel);
		
		textField1 = new JTextField();
		textField1.setBounds(20, 63, 142, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(20, 94, 142, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		numLbl1 = new JLabel("give value 1");
		numLbl1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		numLbl1.setBounds(172, 58, 138, 28);
		frame.getContentPane().add(numLbl1);
		
		numLbl2 = new JLabel("give value 2");
		numLbl2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		numLbl2.setBounds(172, 89, 138, 28);
		frame.getContentPane().add(numLbl2);
		
		ADD_BTN = new JButton("ADD value");
		ADD_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x , y, ans=0;
				try {
					x= Integer.parseInt(textField1.getText());
					y= Integer.parseInt(textField2.getText());
					ans = x+y;
					ansField.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Number input invalid");
				}
			}
		});
		ADD_BTN.setBounds(20, 125, 111, 23);
		frame.getContentPane().add(ADD_BTN);
		
		SUB_BTN = new JButton("SUB value");
		SUB_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x , y, ans=0;
				try {
					x= Integer.parseInt(textField1.getText());
					y= Integer.parseInt(textField2.getText());
					ans = x-y;
					ansField.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Number input invalid");
				}
			}
			
		});
		SUB_BTN.setBounds(146, 125, 138, 23);
		frame.getContentPane().add(SUB_BTN);
		
		ansField = new JTextField();
		ansField.setColumns(10);
		ansField.setBounds(126, 173, 96, 20);
		frame.getContentPane().add(ansField);
		
		lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblAnswer.setBounds(10, 168, 105, 28);
		frame.getContentPane().add(lblAnswer);
	}
}
