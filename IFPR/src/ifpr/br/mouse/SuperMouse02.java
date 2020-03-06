package ifpr.br.mouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import javafx.scene.control.Button;

public class SuperMouse02 extends JFrame {
	public void SuperMouse02 () {
		super.setSize(800,600);
		super.setVisible(true);		
		TrataMouse mouse = new TrataMouse();
		this.addMouseListener(mouse);


	}
	private class TrataMouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("Clicks: "+ e.getClickCount());
			System.out.println("Localização" + e.getLocationOnScreen());
			
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
		
	}
	public static void main(String args[]) {
		new SuperMouse02();
	}
}
