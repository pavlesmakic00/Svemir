package lab3_zadatak1;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Objekat {
	private int x,y;
	protected Color boja;
	public Objekat(int x, int y, Color boja) {
		
		this.x = x;
		this.y = y;
		this.boja = boja;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x += x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y += y;
	}
	
	
	public abstract void crtaj(Graphics g);
	
	
}
