package fr.tib.GameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import fr.tib.game.GamePanel;

public class MenuStart extends GameState {
	private String[] options = { "Start", "Help", "Quit" };
	private int currentSelection = 0;

	public MenuStart(GameStateManager gsm) {
		this.gsm = gsm;
	}

	public void init() {
	}

	public void tick() {
	}

	//ecran start
	public void draw(Graphics g) {
		g.setFont(new Font("Arial", Font.PLAIN, 60));

		for (int i = 0; i < options.length; i++) {
			if (currentSelection == i) {
				g.setColor(Color.ORANGE);
			} else {
				g.setColor(Color.WHITE);
			}
			g.drawString(options[i], GamePanel.WIDTH / 2 - 75, 200 + 100 * i);
		}

	}

	public void keyPressed(int k) {
		if (k == KeyEvent.VK_DOWN) {
			currentSelection++;
			if (currentSelection >= options.length) {
				currentSelection = 0;
			}
		}
		if (k == KeyEvent.VK_UP) {
			currentSelection++;
			if (currentSelection < 0) {
				currentSelection = options.length - 1;
			}
		}
		if (k == KeyEvent.VK_ENTER) {
			selectOption();
		}
	}

	public void keyReleased(int k) {

	}

	//option clik demarage
	public void selectOption() {
		if(currentSelection==0) {
			GameStateManager.states.push(new Wave1State(gsm));
		}
		else if(currentSelection==1) {
			JOptionPane.showMessageDialog(null, "Help","Help",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else if(currentSelection==2) {
			JFrame frmLoginSystem = new JFrame("Exit");
			if (JOptionPane.showConfirmDialog(frmLoginSystem, "Voulez-vous vraiment sortir ? ", "Space Invaders",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
				System.exit(0);
			}
		}
	}
}
