package fr.tib.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import fr.tib.GameState.GameStateManager;


public class GamePanel extends JPanel implements Runnable, KeyListener {

	private static final long serialVersionUID = 1L;
	public static int WIDTH = 800, HEIGHT = 600;
	private Thread thread;
	public static boolean isRunning = false;
	
	private int FPS = 60;
	
	private long targetTime = 1000 / FPS;
	private long currentFPS;
	
	private GameStateManager gsm;

	public GamePanel() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		addKeyListener(this);
		setFocusable(true);
		start();
	}

	public void start() {
		isRunning = true;
		thread = new Thread(this);
		thread.start();
	}

	public void stop() {
		isRunning = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		gsm= new GameStateManager();
		
		long start;
		long elapsed;
		long wait=1;
		
		while (isRunning) {
			start=System.nanoTime();
			tick();
			repaint();
			
			elapsed=System.nanoTime()-start;
			wait=targetTime-elapsed/1000000;
			if(wait<0) {
				wait=5;
			}
			//probleme division par 0
			currentFPS= 1000/wait;
			try {
				Thread.sleep(5);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	public void tick() {
		gsm.tick();
	}
	
	//changer color fps
	public void paint(Graphics g) {
		g.setFont(new Font("Arial", Font.PLAIN, 18));
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.setColor(Color.ORANGE);
		g.drawString("FPS "+currentFPS, 10, 20);
		gsm.draw(g);
	}

	@Override
	public void keyPressed(KeyEvent k) {
		gsm.keyPressed(k.getKeyCode());

	}

	@Override
	public void keyReleased(KeyEvent k) {
		gsm.keyReleased(k.getKeyCode());

	}

	@Override
	public void keyTyped(KeyEvent k) {
		

	}

}
