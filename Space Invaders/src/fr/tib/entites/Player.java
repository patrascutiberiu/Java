package fr.tib.entites;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import fr.tib.GameState.GameState;
import fr.tib.game.GamePanel;
import fr.tib.game.Images;

public class Player extends GameEntity {

	private static final long serialVersionUID = 1L;
	private boolean left = false, right = false;
	private int moveSpeed = 4;
	private ArrayList<Bullet> bullets;
	private int bulletCount = 0, bullet = 80;
	private int lives = 9;

	public Player() {
		setBounds(GamePanel.WIDTH / 2 - Images.player.getWidth() / 2, GamePanel.HEIGHT - 90, Images.player.getWidth(),
				Images.player.getHeight());
		bullets = new ArrayList<Bullet>();
	}

	public void tick(ArrayList<Enemy> enemies) {
		if (x + width >= GamePanel.WIDTH) {
			right = false;
		}
		if (x <= 0) {
			left = false;
		}
		if (left) {
			x -= moveSpeed;
		}
		if (right) {
			x += moveSpeed;
		}

		for (int i = 0; i < bullets.size(); i++) {
			Bullet b = bullets.get(i);
			b.tick();
			for (int j = 0; j < enemies.size(); j++) {
				Enemy e = enemies.get(j);
				if (checkCollision(e, b)) {
					if (enemies.get(j).getID() == 1) {
						GameState.score += 20;
					} else if (enemies.get(j).getID() == 2) {
						GameState.score += 30;
					} else if (enemies.get(j).getID() == 3 ) {
						GameState.score += 40;
					}
					bullets.remove(i);
					enemies.remove(j);
				}

			}
			if (b.shouldRemove()) {
				bullets.remove(i);
				i--;
			}
		}
		for (int i = 0; i < GameState.enemyBullets.size(); i++) {
			Bullet b = GameState.enemyBullets.get(i);
			if (checkCollision(b, this)) {
				lives--;
				GameState.enemyBullets.remove(i);
			}
		}
		if (bullet > bulletCount) {
			bulletCount++;
		}
		if (lives <= 0) {
			//console game over
			JOptionPane.showMessageDialog(null,"Au revoir ","Game Over",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}

	public void draw(Graphics g) {
		g.drawImage(Images.player, x, y, width, height, null);
		for (int i = 0; i < bullets.size(); i++) {
			Bullet b = bullets.get(i);
			b.draw(g);

		}
		//changer taille score lives
		g.setColor(Color.ORANGE);
		g.setFont(new Font("Arial", Font.PLAIN, 18));
		g.drawString("Lives : " + lives, GamePanel.WIDTH - 90, 20);
		g.drawString("Score : "+GameState.score, GamePanel.WIDTH - 90, 40);
	}

	public void keyPressed(int k) {
		if (k == KeyEvent.VK_RIGHT) {
			right = true;
		}
		if (k == KeyEvent.VK_LEFT) {
			left = true;
		}
		if (k == KeyEvent.VK_SPACE) {
			if (bulletCount >= bullet) {
				bullets.add(new Bullet(x + width / 2, y, -5));
				bulletCount = 0;
			}
		}
	}

	public void keyReleased(int k) {
		if (k == KeyEvent.VK_RIGHT) {
			right = false;
		}
		if (k == KeyEvent.VK_LEFT) {
			left = false;
		}
	}
}
