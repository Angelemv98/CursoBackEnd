public class exCiclos {
	public static void main(String[] args) {
		/*
		 * Ejemplo con while int contador = 0; while(contador<=10) { //Mientras
		 * que(Condicion sea){hara esto} System.out.println(contador); contador+=2; }
		 */

		/*
		 * Suma de los numeros del 1 -10 con el scope fuera ya que se hace para que se
		 * acumule la cantidad de el ciclo con respecto a total int total=0; int
		 * contador = 0; while (contador <= 10) { total = total+contador; contador += 1;
		 * } System.out.println(total);
		 * 
		 */
		// Ciclo FOR
		
		/*
		 * for(int i= 0 ;i<=10;i++) { System.out.println(i); }
		 */		 

		//TABLA DE MULTIPLICAR
		
		for(int x=0;x<=10;x++) {
			for(int y=0; y<=10;y++) {
				System.out.print(x*y);
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}