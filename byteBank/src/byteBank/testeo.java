package byteBank;

public class testeo {
public static void main(String[] args) {
	cuenta cuentadePrueba = new cuenta();
	
	cuentadePrueba.titular = new cliente();
	cuentadePrueba.titular.nombre = "Angel";
	cuentadePrueba.titular.numeroIdentidad = "1987512457";
	cuentadePrueba.titular.profesion = "Programador";

	
	System.out.println(cuentadePrueba.titular.nombre + cuentadePrueba.titular.numeroIdentidad + cuentadePrueba.titular.profesion);
}
}
