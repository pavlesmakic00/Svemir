package lab3_zadatak1;


import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import java.util.ArrayList;


public class Svemir extends Canvas implements Runnable {
	
	
	
	//private int time=100;
	private Thread thread=null;
	
	
	private ArrayList<NebeskoTelo> figures = new ArrayList<>();
	
	public Svemir() {
		this.setBackground(Color.BLACK);
		figures = new ArrayList<>();
	}
	
	
	
	@Override
	public void paint(Graphics g) {
		
		for(int i=0;i<figures.size();i++) {
			figures.get(i).crtaj(g);	
		}
	}
	
	public synchronized void go() {
		if(thread == null) {
			thread = new Thread(this);
			thread.start();
		}
	
	}
	
	
	public synchronized void finish() {
		if(thread != null) {
			thread.interrupt();
		}
		while (thread != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
	}
	
	
	
	
	
	public void dodaj(NebeskoTelo e) {
		figures.add(e);
	}
	
	
	@Override
	public void run() {
		Graphics g = this.getGraphics();
			try {
				while(!thread.isInterrupted()) {
					repaint();
					
					for(int i=0;i<figures.size();i++) {
						
						
						figures.get(i).setY(5);
						
					}
					Thread.sleep(100);
				
				}
			} catch(InterruptedException e) {}
			synchronized (this) {
				thread=null;
				notify();
			}
	}
		
	
}
