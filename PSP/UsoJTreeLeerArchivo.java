import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UsoJTreeLeerArchivo extends JFrame{

	String archivo;
	public static void main(String[] args) {
		
		new UsoJTreeLeerArchivo();
		
		
	}
	

	public UsoJTreeLeerArchivo() {
		String archivo = abrirArchivo();
		System.out.println(archivo);
		
	}

	private  String abrirArchivo() {
		  String aux="";   
		  String texto="";
		  try
		  {
		   /**llamamos el metodo que permite cargar la ventana*/
		   JFileChooser file=new JFileChooser();
		   file.showOpenDialog(this);
		   /**abrimos el archivo seleccionado*/
		   File abre=file.getSelectedFile();

		   /**recorremos el archivo, lo leemos para plasmarlo
		   *en el area de texto*/
		   if(abre!=null)
		   {     
		      FileReader archivos=new FileReader(abre);
		      BufferedReader lee=new BufferedReader(archivos);
		      while((aux=lee.readLine())!=null)
		      {
		         texto+= aux+ "\n";
		      }
		         lee.close();
		    }    
		   }
		   catch(IOException ex)
		   {
		     JOptionPane.showMessageDialog(null,ex+"" +
		           "\nNo se ha encontrado el archivo",
		                 "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
		    }
		  return texto;//El texto se almacena en el JTextArea
		}
	
	
}
