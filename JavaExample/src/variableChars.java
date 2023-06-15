
public class variableChars {
public static void main(String[] args) {
	char caracter = 'e';//Solo acepta un caracter o un numero el cual imprimira el caracter en numero ASCII
	System.out.println(caracter);
	
	caracter =65;
	System.out.println(caracter);
	
	caracter = 65 +1;
	System.out.println(caracter);
	
	char segundoChar = (char) (caracter+1);
	System.out.println(segundoChar);
	
	String palabraFraseString = "Wacha esto es un String"; // Imprimir cadena de caracteres
	System.out.println(palabraFraseString);
	
	palabraFraseString = palabraFraseString + " Aqui agrego o concateno otra frase";
	System.out.println(palabraFraseString);
}
}
