package com.bytebank.test;

import java.util.Iterator;

public class testMain {
	public static void main(String[] args) {
		
		for(int i = 0 ; i<args.length ; i++) {
			System.out.println(args[i]);
		}
		
		int edad =10 ;
		int edad1 = 23;
		int edad2 = 34;
		
		//Para agrupar todas las edades
		
		int [] edades = new int[5];
		edades[1] = edad1;
		//System.out.println(edades[2]);
		
		
		int tamanioArray = edades.length;
		
		//System.out.println(tamanioArray);
	
		for(int i = 0 ; i<tamanioArray ; i++) {
			System.out.println(edades[i]);
		}
	}
}
