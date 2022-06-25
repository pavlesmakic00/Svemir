package lab3_zadatak1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Kometa extends NebeskoTelo {
	private double random = Math.random()*360*Math.PI/180;
	
	public Kometa(int x, int y, Color boja, int r) {
		super(x, y, boja, r);
		
	}
 
	public Kometa(int x,int y,int r) {
	    this(x,y,Color.GRAY,r);
	}
	@Override
	public void crtaj(Graphics g) {
		
		Color prethodna = g.getColor();
		
		g.setColor(this.boja);
		
		int []x = new int[5];
		int []y = new int[5]; 
        for (int i = 0; i < 5; i++) {
            double angle = random + i* 2 * Math.PI / 5 ;
            x[i] = (int) (this.getX()+ this.r * Math.cos(angle));
            y[i] =  (int) (this.getY()+this.r * Math.sin(angle));
                      
        }
        Polygon p = new Polygon(x,y,5);
        
        g.fillPolygon(p);
       g.setColor(prethodna);
	}

}


/*package paket;

import java.awt.Label;

public class Timer extends Thread {
	
	private Label label;
	private int s, m;
	private boolean work;

	public Timer(Label label) {
		this.label = label;
	}
	
	public void run() {
		try {
			while(!isInterrupted()) {
				
				synchronized (this) {
					while(!work){
						wait();
					}
				}
				
				label.setText(toString());
				label.revalidate();
				sleep(1000);
				s++;
				if (s % 60 == 0) { m++; s = 0; }
			}
		} catch(InterruptedException e) {}
	}
	
	public synchronized void go() {
		work = true;
		notify();
	}
	
	public synchronized void pause() {
		work = false;
	}
	
	public synchronized void reset() {
		m = s = 0;
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d", m, s);
	}

}
*/