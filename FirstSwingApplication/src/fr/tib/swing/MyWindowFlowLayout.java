package fr.tib.swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MyWindowFlowLayout extends JFrame {

	private static final long serialVersionUID = 1495997936368937947L;

	public MyWindowFlowLayout() {
		super("Ma premiere aplication swing");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(500, 200);
		this.setLocationRelativeTo(null);
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new GridLayout(4, 1, 20, 20));

		JButton btnPush = new JButton("Push me!");
		contentPane.add(btnPush);
		JButton btnClick = new JButton("Click me!");
		contentPane.add(btnClick);
		JCheckBox chkCheck = new JCheckBox("Check me!");
		contentPane.add(chkCheck);
		JTextField txtEdit = new JTextField("Edit me");
		txtEdit.setPreferredSize(new Dimension(120, 30));
		contentPane.add(txtEdit);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// apply a look'n feel
		UIManager.setLookAndFeel(new NimbusLookAndFeel());

		MyWindowFlowLayout myWindow = new MyWindowFlowLayout();
		myWindow.setVisible(true);

	}

}
