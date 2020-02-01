package fr.tib.entites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

import fr.tib.GameState.GameState;
import fr.tib.game.Images;

public class Enemy extends GameEntity {

	private static final long serialVersionUID = 1L;
	private BufferedImage currentSprinte;
	private BufferedImage firstSprite;
	private BufferedImage secondSprite;
	public static int dx = 5;
	private Random r = new Random();

	private int id;

	public Enemy(int x, int y, int id) {
		this.id = id;

		if (id == 1) {
			firstSprite = Images.enemy1_1;
			secondSprite = Images.enemy1_2;
		} else if (id == 2) {
			firstSprite = Images.enemy2_1;
			secondSprite = Images.enemy2_2;
		} else if (id == 3) {
			firstSprite = Images.enemy3_1;
			secondSprite = Images.enemy3_2;
		} else {
			System.out.println("Invalid ID");
			System.exit(OUT_BOTTOM);
		}

		currentSprinte = firstSprite;
		setBounds(x, y, firstSprite.getWidth(), firstSprite.getHeight());
	}

	public void tick(boolean move) {
		if (move) {
			if (currentSprinte == firstSprite) {
				currentSprinte = secondSprite;
			} else if (currentSprinte == secondSprite) {
				currentSprinte = firstSprite;
			}
			if (r.nextInt(100) + 1 > 99) {
				GameState.enemyBullets.add(new Bullet(x + width / 2, y + height, 5));
			}
			x += dx;
		}
	}

	public void draw(Graphics g) {
		g.drawImage(currentSprinte, x, y, width, height, null);
	}

	public int getID() {
		return id;
	}

}
