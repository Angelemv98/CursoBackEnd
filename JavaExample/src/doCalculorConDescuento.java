import javax.swing.plaf.TextUI;

public class doCalculorConDescuento {

	public static void main(String[] args) {
		double desc = 0;
		double valor = 250.00;
		if (valor>=100 && valor <=199.99) {
			desc = 10.0;
		}
		if (valor>=200 && valor <=299.99) {
			desc = 20.0;
		}
		if (valor>=300) {
			desc = 30.0;
		}
		double valorFinal = valor - (valor*(desc/100));
		System.out.println("Tu producto tuvo un: "+desc+"% de descuento,\n Costo total: "+valor+" \n Costo final: "+valorFinal);
	}

}
