
public class TestConexion {

	public static void main(String[] args) throws Exception {

		try(Conexion conn = new Conexion()){
			conn.leerDatos();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		
		
		
		/*
		 * Conexion conexion = new Conexion(); try { conexion.leerDatos(); } catch
		 * (IllegalStateException e) { System.out.println("RevibiendoException");
		 * e.printStackTrace();
		 * 
		 * }finally { conexion.cerrar(); }
		 */
		
		
	}

}
