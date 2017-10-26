package pizzaria.chila;

public abstract class Empleados {
	private int idEmpleado;
	private String nombre;
	private String sexo;
	
	public int getidEmpleado()
	{
		return idEmpleado;
	}
	public void setIdEmpleado(int _idEmpleado) {
	this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
		}
		
	public void setNombre(String nombre) {
		this.nombre = nombre;
		}
	public String getSexo() {
		return sexo;
		}
	public void setsexo(String sexo) {
		this.sexo = sexo;
		}
	
	
	
	

}
