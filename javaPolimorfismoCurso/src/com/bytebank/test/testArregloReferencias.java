package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;


public class testArregloReferencias {
	public static void main(String[] args) {
		
		int [] numeros = new int [10];
		
		int numero = 40;
		// Integer numeroObjetoInteger = 50; manera deprecado
		Integer numeroObjetoInteger = Integer.valueOf(50);
		
		
		List <Integer>listaList = new ArrayList<Integer>();
		
		listaList.add(numero); // Autonboxing : el numero lo inicializa como un nuevo integer como es del mismo tipo por eso acepta el primitivo en la lista de objetos
		listaList.add(numeroObjetoInteger);

		//Unboxing: se refiere cuando se tiene un valor primitivo de un objeto 
		int valorPrimitivo = numeroObjetoInteger;
		
		byte integerByte = numeroObjetoInteger.byteValue();
		double doubleInteger = numeroObjetoInteger.doubleValue();
		
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
	}
}
 