package lab3_zadatak1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public  class Simulator extends Frame {
	
	Panel centerPanel = new Panel();
	 Svemir svemir = new Svemir();
	 Generator gen = new Generator(svemir);
	 private Panel bottomPanel = new Panel();
	Button sad = new Button("Pokerni!");
	
	private void populateWindow() {
		
		centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		//add(svemir, BorderLayout.CENTER);
		sad.addActionListener((ae)->{
			svemir.go();
			gen.go();
			sad.setEnabled(false);
		});
		bottomPanel.add(sad);
		add(bottomPanel, BorderLayout.SOUTH);
		add(svemir,BorderLayout.CENTER);
		
		
		
	}
	

	public Simulator() {
		setBounds(700,200,200,400);
		setResizable(false);
		Graphics g = this.getGraphics();
				
				//svemir.paint(g);
				//gen.paint(g);
				
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				svemir.finish();
				gen.finish();
				dispose();
			}
		});
		populateWindow();
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Simulator();
	}
}

/*Panel rad = new Panel();
rad.setLayout(new GridLayout(1,2));

Panel izbor = new Panel();
izbor.setLayout(new GridLayout(3,1));
Label izbor1 = new Label("Izaberite:" + bat.getKolicina());
CheckboxGroup grupa = new CheckboxGroup();
Checkbox c1 = new Checkbox("Hidro",grupa,true);
Checkbox c2 = new Checkbox("Mlin",grupa,false);
izbor.add(izbor1);
izbor.add(c1);
izbor.add(c2);

izbor2 = new Label("Trenutno stanje baterije je:" + bat.getKolicina());
izbor2.setAlignment(Label.CENTER);
Panel brBar = new Panel();
brBar.add(izbor2);
rad.add(izbor);
izbor.setBackground(Color.CYAN);
rad.add(brBar);
bat.postaviL(izbor2);
//rad.add(grupa);



this.add(rad,BorderLayout.SOUTH);

MenuBar meni = new MenuBar();
Menu malimeni = new Menu("Meni");
malimeni.add("crveno");
malimeni.add("Drugo");
//malimeni.addActionListener(this);
meni.add(malimeni);
setMenuBar(meni);

Lista li = new List(3,true);

addMouseMotionListener(new MouseMotionAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				adjust("mouse dragged", e);
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				adjust("mouse moved", e);
			}
			
		});
		
		
		
		private void showHelpDialog() {
		Dialog help = new Dialog(this, ModalityType.APPLICATION_MODAL);
		help.setTitle("Help");
		help.add(new Label("Use a-s-w-d to move.", Label.CENTER));
		help.setBounds(700, 200, 100, 100);
		help.setResizable(false);
		
		help.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				help.dispose();
			}
		});;
		
		help.setVisible(true);
	}


public void actionPerformed(ActionEvent e){
	String komanda = e.getActionCommand();
	repaint();
	}


*/

/*this.addKeyListener(new KeyAdapter() {

@Override
public void  keyTyped(KeyEvent e) {
	char key = Character.toUpperCase(e.getKeyChar());
	System.out.println("LALALA");
	switch(key) {
	case KeyEvent.VK_W: {
		int i=lista.indexOf(p);
		if(i-y>0) {izaberi(lista.get(i-y));p.setFont(new Font("Serif",Font.BOLD,20));}
		
		break;
	}
	case KeyEvent.VK_S: {
		int i=lista.indexOf(p);
		if(i+y<lista.size()) {izaberi(lista.get(i-y));p.setFont(new Font("Serif",Font.BOLD,20));}
		break;
	}
	case KeyEvent.VK_A: {
		//int i=plac.lista.indexOf(plac.p);
		//if(i-1>0) {plac.izaberi(plac.lista.get(i-k));plac.p.setFont(new Font("Serif",Font.BOLD,20));}
		break;
	}
	case KeyEvent.VK_D: {
		//int i=plac.lista.indexOf(plac.p);
		//if(i-k>0) {plac.izaberi(plac.lista.get(i-k));plac.p.setFont(new Font("Serif",Font.BOLD,20));}
		break;
	}
	}
}



addMouseMotionListener(new MouseMotionAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				adjust("mouse dragged", e);
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				adjust("mouse moved", e);
			}
			
		});
});*/
