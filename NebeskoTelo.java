package lab3_zadatak1;

import java.awt.Color;
import java.awt.Graphics;

public abstract class NebeskoTelo extends Objekat {

	protected int r;
	
	public NebeskoTelo(int x, int y, Color boja,int r) {
		super(x, y, boja);
		this.r=r;
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public abstract void crtaj(Graphics g);

}
