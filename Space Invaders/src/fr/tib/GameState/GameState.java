package fr.tib.GameState;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import fr.tib.entites.Bullet;

public abstract class GameState {

	protected GameStateManager gsm;
	public static ArrayList<Bullet> enemyBullets;
	public static ArrayList<BufferedImage> explosion;
	public static int score=0;
	public abstract void init();
	public abstract void tick();
	public abstract void draw(Graphics g);
	public abstract void keyPressed(int k);
	public abstract void keyReleased(int k);
}
