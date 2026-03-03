import java.util.ArrayList;

public class Inventario {
	private ArrayList<Mascotas> mascota;

	public Inventario() {
		mascota = new ArrayList<>();
	}

	public void vaciar() {
		return;
	}

	public void anyadirMascota(Mascotas a) {
		mascota.add(a);
	}
	
	public void eliminarMascota(String nombreI) {
		for (int i = 0; i < mascota.size(); i++) {
			Mascotas m = mascota.get(i);
			if(m.getNombre().equals(nombreI)) {
				mascota.remove(m);
			}
		}
	}
	
	public void imprimirTodos() {
		System.out.println(mascota);
	}
	
	public void imprimirPerrros() {
		for (Mascotas mascotas : mascota) {
			if (mascotas instanceof Perro) {
				System.out.println(mascotas);
			}
		}
		
	}

	@Override
	public String toString() {
		return "Inventario [mascota=" + mascota + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
