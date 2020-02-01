package fr.tib.GameState;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import fr.tib.entites.Bullet;
import fr.tib.entites.Enemy;
import fr.tib.entites.Player;
import fr.tib.game.GamePanel;

public class Wave1State extends GameState {

	private Player player;

	private int[][] enemyIds = { {3, 3, 3, 3, 3, 3 }, { 2, 2, 2, 2, 2, 2 },{ 1, 1, 1, 1, 1, 1 }, { 2, 2, 2, 2, 2, 2 },
			{ 1, 1, 1, 1, 1, 1 }

	};

	private ArrayList<Enemy> enemies;

	//changement vitese enemie
	private int moveCount = 10, moves = 0;

	private boolean move = false;

	private int farthestLeftx = 100;
	private int farthestRightx = -100;
	private int farthestRighti, farthestLefti;

	public Wave1State(GameStateManager gsm) {
		this.gsm = gsm;
		init();
	}

	public void init() {
		player = new Player();
		enemyBullets = new ArrayList<Bullet>();
		 explosion=new ArrayList<BufferedImage>();
		enemies = new ArrayList<Enemy>();

		for (int i = 0; i < enemyIds.length; i++) {
			for (int j = 0; j < enemyIds[0].length; j++) {
				enemies.add(new Enemy(j * 60, i * 60, enemyIds[i][j]));
			}
		}
	}

	public void tick() {
		player.tick(enemies);
		if (moves < moveCount) {
			moves++;
			move = false;
		} else {
			moves = 0;
			move = true;
		}
		for (int i = 0; i < enemies.size(); i++) {
			enemies.get(i).tick(move);
			if (enemies.get(i).x < farthestLeftx) {
				farthestLeftx = enemies.get(i).x;
				farthestLefti = i;
			}
			if (enemies.get(i).x > farthestRightx) {
				farthestRightx = enemies.get(i).x;
				farthestRightx = i;
			}
		}
		//gauche et droit enemy
		if (enemies.get(farthestRighti).x + enemies.get(farthestRighti).width >= GamePanel.WIDTH -300) {
			Enemy.dx *= -1;
			for (int i = 0; i < enemies.size(); i++) {
				enemies.get(i).y += 20;
				enemies.get(i).x -= 10;
			}
		}
		if (enemies.get(farthestLefti).x <= 20) {
			Enemy.dx *= -1;
			for (int i = 0; i < enemies.size(); i++) {
				enemies.get(i).y += 20;
				enemies.get(i).x += 10;
			}
		}

		for (int i = 0; i < enemyBullets.size(); i++) {
			enemyBullets.get(i).tick();
		}
	}

	public void draw(Graphics g) {
		player.draw(g);
		for (int i = 0; i < enemies.size(); i++) {
			enemies.get(i).draw(g);
		}
		for (int i = 0; i < enemyBullets.size(); i++) {
			enemyBullets.get(i).draw(g);
		}
	}

	public void keyPressed(int k) {
		player.keyPressed(k);

	}

	public void keyReleased(int k) {
		player.keyReleased(k);

	}

}
