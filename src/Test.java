
public class Test {

	public static void main(String[] args) {
		Perro r = new Perro("Rocky", 1, "OK", "11022017");
		Gato g = new Gato("Negro", 2, "OK", "05012016");

		System.out.println(r.getNombre());
		System.out.println(g.getEstado());
		
		Inventario i = new Inventario();
		i.anyadirMascota(r);
		i.anyadirMascota(g);
		i.imprimirTodos();
		i.imprimirPerrros();
		i.vaciar();
		i.imprimirTodos();
		i.imprimirPerrros();
		
		
	}

}
