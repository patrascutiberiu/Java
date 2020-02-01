package fr.tib.swing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MyWindow extends JFrame {

	private static final long serialVersionUID = 1495997936368937947L;

	public MyWindow() {
		super("Ma premiere aplication swing");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(500, 200);
		this.setLocationRelativeTo(null);
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));
		contentPane.add(new JButton("Push me!"));
		contentPane.add(new JButton("Click me!"));
		contentPane.add(new JCheckBox("Check me!"));
		contentPane.add(new JTextField("Edit me"));
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//apply a look'n feel
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		
		MyWindow myWindow = new MyWindow();
		myWindow.setVisible(true);

	}

}
