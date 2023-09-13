/**
 * 
 */
package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author admin-PC
 *
 */
public class PruebasEventos {
	
	public static void main(String ar[]) {
		MarcoBotones miMarco = new MarcoBotones();
	}

}
class MarcoBotones extends JFrame{
	/**
	 * 
	 */
	public MarcoBotones() {
		
		setVisible(true);
		setSize(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		LaminaBotones miLamina = new LaminaBotones();
		
		add(miLamina);
		
	}
}

class LaminaBotones extends JPanel{
	
	JButton botonBlue = new JButton("Blue");
	JButton botonYellow = new JButton("Amarillo");
	JButton botonRed= new JButton("Rojo");
	
	public LaminaBotones() {
		add(botonBlue);
		add(botonYellow);
		add(botonRed);
		
		botonBlue.addActionListener(new ColorFondo(Color.blue));
		botonYellow.addActionListener(new ColorFondo(Color.yellow));
		botonRed.addActionListener(new ColorFondo(Color.red));
	}
	
	private class ColorFondo implements ActionListener{
		
		private Color colorFondo ;
		
		public ColorFondo(Color c){
			
			colorFondo = c ; 
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
		
			setBackground(colorFondo);
		}
	}
	
}


