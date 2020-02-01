package fr.tib.Login;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JFrame frmLoginSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Login System");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel.setBounds(140, 0, 179, 49);
		contentPane.add(lblNewLabel);

		JLabel lblUsername = new JLabel("Utilisateur");
		lblUsername.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblUsername.setBounds(39, 72, 129, 20);
		contentPane.add(lblUsername);

		JLabel lblPassword = new JLabel("Mot de passe");
		lblPassword.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblPassword.setBounds(39, 156, 129, 20);
		contentPane.add(lblPassword);

		JTextArea txtUsername = new JTextArea();
		txtUsername.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtUsername.setBounds(178, 60, 204, 32);
		contentPane.add(txtUsername);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(178, 144, 204, 32);
		contentPane.add(txtPassword);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = txtPassword.getText();
				String username = txtUsername.getText();

				if (username.contains("admin") && password.contains("admin")) {
					txtUsername.setText(null);
					txtPassword.setText(null);

					// daca reuseste loginul se leaga celalalt fisier java la acesta
					// nume.java = new nume.java();
					// nume.main(null);
				} else {
					JOptionPane.showMessageDialog(null,
							"Vous n'êtes pas autorisé à vous connecter !"
									+ "\n Contactez votre administrateur système. ",
							"Login Erreur", JOptionPane.WARNING_MESSAGE);
					txtUsername.setText(null);
					txtPassword.setText(null);
				}
			}
		});
		btnLogin.setFont(new Font("Segoe Print", Font.BOLD, 20));
		btnLogin.setBounds(39, 213, 89, 37);
		contentPane.add(btnLogin);

		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Segoe Print", Font.BOLD, 20));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnReset.setBounds(178, 213, 89, 37);
		contentPane.add(btnReset);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frmLoginSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem, "Voulez-vous vraiment sortir ? ", "Login System",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Segoe Print", Font.BOLD, 20));
		btnExit.setBounds(314, 213, 89, 37);
		contentPane.add(btnExit);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.RED);
		separator_1.setBounds(39, 200, 364, 2);
		contentPane.add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.RED);
		separator_2.setBounds(39, 41, 364, 10);
		contentPane.add(separator_2);
	}
}
