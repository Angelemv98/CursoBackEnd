
public class TestCuentaExceptionChecked {
	public static void main(String[] args) {

		Cuenta cuenta = new Cuenta();
		
		try {
			cuenta.deposita();
		} catch (MiExcepcion e) {
			System.out.println("Excepcion atrapada");
			e.printStackTrace();
		}
		
	}
}
