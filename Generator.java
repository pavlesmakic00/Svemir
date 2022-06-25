package lab3_zadatak1;



public class Generator implements Runnable  {
	Svemir sve;
	
	private Thread thread;
	
	
	
	
	public Generator(Svemir sve) {
		
		this.sve = sve;
		
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
	
	
	@Override
	public void run() {
		
		try {
			while(!thread.isInterrupted()) {
				
				Thread.sleep(900);
				//System.out.println("uslo");
				int x = (int)(Math.random()*200);
				
				int r = (int)(Math.random()*30)+10;
				
				sve.dodaj(new Kometa(x,0,r));
				//sve.repaint();
				
				//sve.getGraphics().clearRect(0, 0, sve.getWidth(),sve.getHeight());
			}
		} catch(InterruptedException e) {}
		synchronized (this) {
			thread=null;
			notify();
		}
	
	}
	
	
}
