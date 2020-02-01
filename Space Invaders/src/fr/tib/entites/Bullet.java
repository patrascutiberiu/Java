package fr.tib.entites;

import java.awt.Color;
import java.awt.Graphics;

import fr.tib.game.GamePanel;

public class Bullet extends GameEntity {

	private static final long serialVersionUID = 1L;

	private int dy;

	//changer la largeur de fusille
	public Bullet(int x, int y, int dy) {
		setBounds(x, y, 5, 10);
		this.dy = dy;
	}

	public boolean shouldRemove() {
		if (y < 0 || x + height > GamePanel.HEIGHT) {
			return true;
		} else {
			return false;
		}
	}

	public void tick() {
		y = y + dy;
	}
	//changer la color des fusilles
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);
	}
}
