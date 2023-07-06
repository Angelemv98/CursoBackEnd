package com.bytebank.test;


public class testWrappers {
	public static void main(String[] args) {
		
		Double numeroDouble = 33.33;
		Boolean bulean = true;
		
		Double numeroDouble2 = Double.valueOf(333);
		
		System.out.println(numeroDouble2);
		
		String numeroString = "23";
		
		Double stringDouble = Double.valueOf(numeroString);
		Integer stringInteger = Integer.valueOf(numeroString);
		System.out.println(stringDouble);
		System.out.println(stringInteger);

		Number numero = Integer.valueOf(5);
		double numeroDoublePrim = numero.doubleValue();
		
		
	}
}
