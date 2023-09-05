/**
 * 
 */
package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.lang.model.AnnotatedConstruct;
import javax.swing.*;

/**
 * @author admin-PC
 *
 */
public class CreandoMarcoCentrado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MarcoCentrado miMarco = new MarcoCentrado() ;
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit(); //almacenamos nuestro sistema nativo de ventana
		
		Dimension tamañoPantalla = miPantalla.getScreenSize() ; 
		
		int alturaPantalla = tamañoPantalla.height ; 

		int anchoPantalla = tamañoPantalla.width ; 
		
		setSize(anchoPantalla/2 , alturaPantalla/2);
		
		setLocation(anchoPantalla/4 , alturaPantalla/4);
		
		setVisible(true);
		
		setTitle("Parabeus");
		
		Image miIcono = miPantalla.getImage("icon-512.png");
		
		setIconImage(miIcono);
		
	}
	
}
