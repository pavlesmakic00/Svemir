package svemir;

import java.awt.Color;
import java.awt.Graphics;

public class Letelica extends Objekat {

	private int sirina;
	private int visina;
	
	public Letelica(int kordx, int kordy, Color boja,int h,int s) {
		super(kordx, kordy, boja);
		sirina=s;
		visina=h;
		
	}

	public Letelica(int kordx,int kordy,int h,int s) {
		this(kordx,kordy,Color.CYAN,h,s);
	}
	
	@Override
	public void crtaj(Graphics g) {
		

		int[] kordx= {
				this.getX(),
				this.getX()+sirina,
				this.getX()-sirina
		};
		
		int[] kordy= {
				this.getY()-visina/2,
				this.getY(),
				this.getY()
		};
		
		g.setColor(this.color);
		//g.translate(getX(), getY());
		g.fillPolygon(kordx, kordy, 3);
		//g.translate(-getX(), -getY());
		
	}

}
