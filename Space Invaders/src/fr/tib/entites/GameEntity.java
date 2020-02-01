package fr.tib.entites;

import java.awt.Rectangle;

public abstract class GameEntity extends Rectangle{

	private static final long serialVersionUID = 1L;
	
	public Boolean checkCollision(GameEntity g1,GameEntity g2) {
		if(g1.intersects(g2)) {
			return true;
		}
		else {
			return false;
		}
	}

}
