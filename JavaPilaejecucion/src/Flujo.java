
public class Flujo {

	public static void main(String[] args) {
		System.out.println("Inicio del main");
		metodo1();
		System.out.println("Fin del main");
	}

	private static void metodo1() {
		System.out.println("Inicio del metodo1");
		try {
			metodo2();			
		} catch (MiExcepcion e) {
			e.printStackTrace();
		}
		System.out.println("Fin del metodo1");
	}

	private static void metodo2() throws MiExcepcion{
		System.out.println("Inicio del metodo2");
		throw new MiExcepcion("La excepcion fue lanzada");
	}

}
