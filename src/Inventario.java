import java.util.ArrayList;

public class Inventario {

	// Se crea un ArrayList privado dentro de la clase
	private ArrayList<Mascotas> mascota;

	public Inventario() {
		mascota = new ArrayList<>();
	}

	//Limpiamos lo que tiene almacenado el array
	public void vaciar() {
		mascota.clear();
	}

	public void anyadirMascota(Mascotas a) {
		mascota.add(a);
	}

	// Se elimina la mascota por posición específica de la lista
	public void eliminarMascota(String nombreI) {
		for (int i = 0; i < mascota.size(); i++) {
			Mascotas m = mascota.get(i);
			if (m.getNombre().equals(nombreI)) {
				mascota.remove(m);
			}
		}
	}

	// Imprimo sólo los nombres de las mascotas
	public void imprimirTodos() {
		for (Mascotas mascotas : mascota) {
			System.out.println(mascotas.getNombre());
		}
	}

	// Imprimo sólo los el tipo de mascota Perro
	public void imprimirPerrros() {
		for (Mascotas mascotas : mascota) {
			if (mascotas instanceof Perro) {
				System.out.println(mascotas.getNombre());
			}
		}

	}

	@Override
	public String toString() {
		return "Inventario [mascota=" + mascota + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
