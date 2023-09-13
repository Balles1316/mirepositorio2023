/**
 * 
 */
package graficos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 * @author admin-PC
 *
 */
public class Eventos_VentanaAdaptadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		MarcoVentanaAdap miMarco = new MarcoVentanaAdap();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Programa Termina
		miMarco.setTitle("Ventana1");
		
		MarcoVentanaAdap miMarco2 = new MarcoVentanaAdap();
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Solo esta ventana se cierra
		miMarco2.setTitle("Ventana");
	}

}

class MarcoVentanaAdap extends JFrame{
	
	/**
	 * This is a contructor or the frame
	 */
	public MarcoVentanaAdap() {
		
		setVisible(true);
		setSize(500,500);
		
		addWindowListener(new M_ventanaAdap());
		
	}
}

class M_ventanaAdap extends WindowAdapter{

	@Override
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana Minimizada");
		
	}
	
} 