
public class exAcceso {
public static void main(String[] args) {
	cuenta cuenta = new cuenta(234213);
	cuenta.deposito(300);
	
	System.out.println(cuenta.getSaldo() + " | " + cuenta.getAgencia());
	
}
}
