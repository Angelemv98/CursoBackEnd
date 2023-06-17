import java.util.Iterator;

public class exMatriz {

	public static void main(String[] args) {
/*		for(int fila=0;fila<=10;fila++) {
			
			for(int columna = 0; columna<fila; columna++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
 */
		 for(int fila = 0; fila < 5; fila++) {
	            for (int columna = 0; columna < 5; columna++) {
	                if ( columna>fila ) {
	                    break;
	                }
	                System.out.print( columna+1);
	            }
	            System.out.println();
	        }
		
		
	}
}
