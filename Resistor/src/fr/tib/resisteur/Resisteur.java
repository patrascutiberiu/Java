package fr.tib.resisteur;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;

public class Resisteur extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resisteur frame = new Resisteur();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Resisteur() {
		setBackground(Color.LIGHT_GRAY);
		setFont(new Font("Segoe Script", Font.BOLD, 20));
		setTitle("Resisteur coleur code calculateur");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setToolTipText("");
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel.setBounds(10, 11, 690, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblResisteurColeurCode = new JLabel("Resisteur coleur code calculateur");
		lblResisteurColeurCode.setBounds(97, 9, 495, 54);
		lblResisteurColeurCode.setForeground(Color.WHITE);
		lblResisteurColeurCode.setBackground(Color.WHITE);
		lblResisteurColeurCode.setFont(new Font("Segoe Print", Font.BOLD, 30));
		panel.add(lblResisteurColeurCode);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel_1.setBounds(10, 73, 690, 369);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_3.setBounds(10, 11, 334, 347);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_4.setBounds(352, 11, 328, 347);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel_2.setBounds(10, 445, 690, 66);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
	}
}
