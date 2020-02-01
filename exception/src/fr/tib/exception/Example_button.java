package fr.tib.exception;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example_button extends JFrame implements ActionListener{

	private static final long serialVersionUID = -4711257722561753347L;
	private JButton btnClickMe= new JButton("Click me ! ");
	private JButton btnPushMe=new JButton("Push me ! ");
	private JButton btnActivateMe= new JButton("Activate me ! ");

	public Example_button() {
		super("Implementation d'Interface");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout( new FlowLayout());
		
		contentPane.add(btnClickMe);
		contentPane.add(btnPushMe);
		contentPane.add(btnActivateMe);
		
		btnClickMe.addActionListener(this);
		this.setSize(600,400);
		this.setLocationRelativeTo(null); 
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Example_button();
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button \"Click me !\" clicked");
	}
}
