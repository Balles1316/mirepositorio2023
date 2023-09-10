/**
 * 
 */

/**
 * @author admin-PC
 *
 */
public class Empleado {

	private int codigo ;
	private String nombre ;
	private String direcccion ;
	private float salario ;
	private float comision;
	
	public Empleado(int codigo, String nombre, String direcccion, float salario, float comision) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.direcccion = direcccion;
		this.salario = salario;
		this.comision = comision;
		
	}

	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", nombre=" + nombre + ", direcccion=" + direcccion + ", salario="
				+ salario + ", comision=" + comision + "]";
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirecccion() {
		return direcccion;
	}

	public void setDirecccion(String direcccion) {
		this.direcccion = direcccion;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getComision() {
		return comision;
	}

	public void setComision(float comision) {
		this.comision = comision;
	}


}
