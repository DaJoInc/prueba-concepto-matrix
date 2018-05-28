package com.ada.matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraysTester {
	
	public static void main(String[] args) throws Exception {
	    
	    List<Integer> listaEnteros = new ArrayList<Integer>();
	    
	    int temporal = 0;
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int cantidadArreglo=0;        
        int numeroDelArreglo=0;
        System.out.print("Introduzca un número entero: ");
        cantidadArreglo = sc.nextInt();
	    
        if (isNumeric(String.valueOf(cantidadArreglo))) {
        	numeroDelArreglo = cantidadArreglo;
		}else {
			throw new Exception("El valor no es valido");
		}
        
        for (int i = 0; i < numeroDelArreglo; i++) {
            System.out.print("Introduzca un número entero: ");
            int n = sc.nextInt();
            if (isNumeric(String.valueOf(n))) {
            	listaEnteros.add(n);
    		}else {
    			System.out.print("Valor no es valido: ");
    		}
			
		}

        
	    for (int i = 0; i < listaEnteros.size(); i++) {
	        for (int j = 1; j < (listaEnteros.size() - i); j++) {
	            if (listaEnteros.get(j - 1) > listaEnteros.get(j)) {
	                temporal = listaEnteros.get(j - 1);
	                listaEnteros.set(j - 1, listaEnteros.get(j));
	                listaEnteros.set(j, temporal);
	            }
	        }
	    }
	    
	    for (Integer integer : listaEnteros) {
	    	 System.out.println(integer);
		}
	   
	}
	
	private static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}

}
