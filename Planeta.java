package svemir;

import java.awt.Color;
import java.awt.Graphics;

public class Planeta extends NebeskoTelo {

	private boolean krug=false;
	
	public Planeta(int kordx, int kordy, Color boja, int r) {
		super(kordx, kordy, boja, r);
		if(Math.random()<1)krug=true;
	}

	public Planeta(int kordx,int kordy,int r) {
		this(kordx,kordy,generisiBoju(),r);
	}
	
	private static Color generisiBoju() {
		double ran=Math.random();
		if(ran<=0.25)return Color.red;
		else if(ran>0.25 && ran<=0.5)return Color.BLUE;
		else if(ran>0.5 && ran<=0.75)return Color.YELLOW;
		else return Color.GREEN;
	}

	@Override
	public void crtaj(Graphics g) {
		
		g.setColor(this.color);
		//g.translate(getX(), getY());
		g.fillOval(this.getX()-r/2, this.getY()-r/2, r, r);
		if(this.krug) {g.drawOval(this.getX()-r, this.getY()-r, 2*r, 2*r);}
		//g.translate(-getX(), -getY());
		
	}

}
