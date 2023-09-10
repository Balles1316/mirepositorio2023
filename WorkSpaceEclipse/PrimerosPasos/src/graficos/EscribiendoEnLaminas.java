package graficos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;

import javax.swing.* ; 

public class EscribiendoEnLaminas{
	
	public static void main(String ar[]){
		
		MarcoConTexto Lamina1 = new MarcoConTexto();
		
	}
	
}

class MarcoConTexto extends JFrame{

	public MarcoConTexto() {
	
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Lamina miLamina = new Lamina(); 
		
		add(miLamina) ;
	
	}
}

class Lamina extends JPanel{
	
	@Override
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		
		g.setColor(Color.BLACK); // Establece el color del texto (en este caso, negro)
		
		g.drawString("Hola Mundo",  100, 100);

	}
	
}