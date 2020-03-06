package ifpr.br.mouse;

import javax.swing.JFrame;

import javafx.scene.control.Button;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SuperMouse extends JFrame implements MouseListener{
	public SuperMouse() {
		setSize(800,600);
		setVisible(true);
		addMouseListener(this);
	}
	
	public static void main(String args[]) {
		new SuperMouse();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Cliques" + e.getClickCount());
		System.out.println("Localização " + e.getX() + "," + e.getY());
		System.out.println("Botão do Clique: " + e.getButton());

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
