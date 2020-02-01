package fr.tib.game;

import javax.swing.JFrame;

public class Game {

	public static void main(String[] args) {
		new Images();
		JFrame frame= new JFrame("Space invaders");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setResizable(false);
		frame.setContentPane(new GamePanel());
		frame.pack();
		frame.setVisible(true); 
		frame.setLocationRelativeTo(null);
		

	}

}
