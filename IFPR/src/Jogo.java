import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import ifpr.br.mouse.SuperMouse;

public class Jogo extends JFrame implements MouseListener{
	public Jogo (){
		setSize(800,600);
		setVisible(true);
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void paintComponent( Graphics g ) {
		   		   // Linhas Verticais
		   g.drawLine(90, 10, 90, 250);
		   g.drawLine(190, 10, 190, 250);
		   // Linhas Horizontais
		   g.drawLine(10, 90, 270, 90);
		   g.drawLine(10, 180, 270, 180);
		   // Bolinha
		   g.drawArc(20, 20, 50, 50, 0, 360);
		   // X
		   g.drawLine(120, 120, 150, 150);
		   g.drawLine(150, 120, 120, 150);
		}   
	public static void main(String args[]) {
		new Jogo();
	}
}
