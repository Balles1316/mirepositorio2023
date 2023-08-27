/**
 * 
 */
package graficos;

import java.awt.Frame;

import javax.sql.rowset.RowSetMetaDataImpl;
import javax.swing.*;

/**
 * @author admin-PC
 *
 */
public class CreandoMarcos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MiMarco a = new MiMarco("Parabeus");
		
		a.setVisible(true);
		
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MiMarco extends JFrame{

	public MiMarco(String title){
		
		setTitle(title);
		setSize(500, 200);
		setLocation(500, 300);
		setResizable(false); // sirve para que tenga unas dimensiones fijas y no sea posible modificar
		setExtendedState(Frame.MAXIMIZED_BOTH); //sirve para que el marco se habra en pantalla completa
		
		/*
		 * Sets the state of this frame. The state is represented as a bitwise mask.
		NORMAL
		Indicates that no state bits are set.
		ICONIFIED
		MAXIMIZED_HORIZ
		MAXIMIZED_VERT
		MAXIMIZED_BOTH
		Concatenates MAXIMIZED_HORIZ and MAXIMIZED_VERT.

		 */
		
	}
	
}
