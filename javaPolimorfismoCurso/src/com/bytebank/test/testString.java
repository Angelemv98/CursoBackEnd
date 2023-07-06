package com.bytebank.test;

public class testString {
public static void main(String[] args) {
	
	String nombreString = "Angel";
	System.out.println("EL string antes de manipularlo: "+ nombreString);
	
	nombreString = nombreString.replace("A", "x");
	nombreString = nombreString.concat(" Es alto y bronceado");
	System.out.println("Desoues del concat y replace " + nombreString);
	nombreString =nombreString.toUpperCase();
	
	char letra = nombreString.charAt(3);
	int indice = nombreString.indexOf("e");
	System.out.println("Ahora se ha extraido el charachter en la posicion 3 de la cadena nombre el cual contiene: "+ letra + " y el numero de inidice de la E en la cadena tiene el numero: "+indice );
	
	}
public static void  printline(String valor) {
	System.out.println(valor);
}
}
