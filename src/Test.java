
public class Test {

	public static void main(String[] args) {

		// Creamos un perro y un gato segun los atributos definidos en las clases
		Perro r = new Perro("Rocky", 1, "OK", "11022017");
		Gato g = new Gato("Negro", 2, "OK", "05012016");

		// Impresión del nombre del perro y el estado del gato
		System.out.println(r.getNombre());
		System.out.println(g.getEstado());

		// Ejecutamos los métodos de la clase inventario
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
