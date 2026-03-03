
//Clase abstracta
public abstract class Mascotas {

	//Clase Padre
	protected String nombre;
	protected int edad;
	protected String estado;
	protected String fechaNac;

	//Constructor e inicialización de las variables
	public Mascotas(String nombre, int edad, String estado, String fechaNac) {
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechaNac = fechaNac;
	}

	//Getter y Setter de los atributos 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	@Override
	public String toString() {
		return "Mascotas [nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNac=" + fechaNac + "]";
	}

}
