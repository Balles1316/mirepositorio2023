/**
 * 
 */
package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 * @author admin-PC
 *
 */
public class Eventos_Ventana {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		MarcoVentana miMarco = new MarcoVentana();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Programa Termina
		miMarco.setTitle("Ventana1");
		
		MarcoVentana miMarco2 = new MarcoVentana();
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Solo esta ventana se cierra
		miMarco2.setTitle("Ventana");
	}

}

class MarcoVentana extends JFrame{
	
	/**
	 * This is a contructor or the frame
	 */
	public MarcoVentana() {
		
		setVisible(true);
		setSize(500,500);
		
		M_ventana windows = new M_ventana();
		
		addWindowListener(windows);
		
	}
}

class M_ventana implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
	
		System.out.println("Ventana Abierta");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
	
		System.out.println("Cerrando Ventana");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
		System.out.println("Ventana cerrada");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana Minimizada");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("Ventana Restaurada");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
		System.out.println("Ventana activada");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Ventana desactivada");
		
	}
	
} 