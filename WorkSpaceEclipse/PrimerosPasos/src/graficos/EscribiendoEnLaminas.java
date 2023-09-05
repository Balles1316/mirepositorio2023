package graficos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.* ; 

public class EscribiendoEnLaminas{
	
	public static void main(String ar[]){
		
		MarcoConTexto Lamina1 = new MarcoConTexto();
		
	}
	
}

class MarcoConTexto extends JFrame{

	public MarcoConTexto() {
	
		MarcoCentrado();
	
	}
	
public void MarcoCentrado() {
	
		
		JFrame newMarco = new JFrame();
		
		Lamina milamina = new Lamina();
		
		newMarco.add(milamina);
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit(); //almacenamos nuestro sistema nativo de ventana
		
		Dimension tamañoPantalla = miPantalla.getScreenSize() ; 
		
		int alturaPantalla = tamañoPantalla.height ; 

		int anchoPantalla = tamañoPantalla.width ; 
		
		newMarco.setSize(anchoPantalla/2 , alturaPantalla/2);
		//newMarco.setLocation(anchoPantalla/4 , alturaPantalla/4);
		newMarco.setLocationRelativeTo(null); 
		newMarco.setVisible(true);
		
		newMarco.setTitle("Parabeus");
		
		Image miIcono = miPantalla.getImage("icon-512.png");
		
		newMarco.setIconImage(miIcono);
		
		newMarco.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		newMarco.pack(); // Ajusta automáticamente el tamaño del marco al contenido de la lámina.
		
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