import java.io.*;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @author admin-PC
 *
 */
public class PruebLectEscitura {
	
	static ArrayList<Empleado> empleados = new ArrayList<>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		empleados.add(new Empleado(1, "Roman","Ballesteros", 700 , 0));
		empleados.add(new Empleado(2, "Juan","Ballesteros", 700 , 0));
		
		try (FileWriter escritor = new FileWriter("empleados.txt")) {
            for (Empleado empleado : empleados) {
                escritor.write(empleado.toString() + "\n"); // Agregar un salto de línea como separador
            }
            System.out.println("Los empleados se han escrito en el archivo correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer empleados desde el archivo
        try (FileReader lector = new FileReader("empleados.txt")) {
            int linea;
            while ((linea = lector.read()) != -1) {
              System.out.print((char)linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
}
