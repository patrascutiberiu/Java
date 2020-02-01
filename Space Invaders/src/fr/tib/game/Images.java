package fr.tib.game;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Images {

	public static BufferedImage player;
	public static BufferedImage enemy1_1, enemy1_2, enemy2_1, enemy2_2, enemy3_1, enemy3_2;
	public static BufferedImage explosion;

	public Images() {
		try {
			player = ImageIO.read(getClass().getResource("player.png"));
			enemy1_1 = ImageIO.read(getClass().getResource("Enemy_1_1.png"));
			enemy1_2 = ImageIO.read(getClass().getResource("Enemy_1.png"));
			enemy2_1 = ImageIO.read(getClass().getResource("Enemy_2.png"));
			enemy2_2 = ImageIO.read(getClass().getResource("Enemy_2_2.png"));
			enemy3_1 = ImageIO.read(getClass().getResource("Enemy_3.png"));
			enemy3_2 = ImageIO.read(getClass().getResource("Enemy_3_3.png"));
			explosion = ImageIO.read(getClass().getResource("explosion.png"));
//			player = ImageIO.read(getClass().getResource("mi.png"));
//			enemy1_1 = ImageIO.read(getClass().getResource("francois.png"));
//			enemy1_2 = ImageIO.read(getClass().getResource("bastien1.png"));
//			enemy2_1 = ImageIO.read(getClass().getResource("mm.png"));
//			enemy2_2 = ImageIO.read(getClass().getResource("bb.png"));
//			enemy3_1 = ImageIO.read(getClass().getResource("gaetan.png"));
//			enemy3_2 = ImageIO.read(getClass().getResource("T.png"));
//			explosion = ImageIO.read(getClass().getResource("explosion.png")); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
