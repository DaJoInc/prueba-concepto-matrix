package com.ada.matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraysTester3 {
	public static void main(String[] args) throws Exception {
	    
	    List<Integer> listaEnteros = new ArrayList<Integer>();
	    List<Integer> listaEnterosOrden = null;
	    int temporal = 0;
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int cantidadArreglo=0;        
        int numeroDelArreglo=0;
        cantidadArreglo = 4;
	    
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
    			numeroDelArreglo--;
    		}
			
		}

       
	    
	    int cantidad = 0;
	    int [] arregloreflectorSOrden = new int [cantidadArreglo];
	    for (Integer integer : listaEnteros) {
	    	arregloreflectorSOrden[cantidad] = integer;
   		 cantidad++;

	    }
	    int [] arregloreflector = new int [cantidadArreglo];
	    listaEnterosOrden = listaEnteros;
	    for (int i = 0; i < listaEnterosOrden.size(); i++) {
	        for (int j = 1; j < (listaEnterosOrden.size() - i); j++) {
	            if (listaEnterosOrden.get(j - 1) < listaEnterosOrden.get(j)) {
	                temporal = listaEnterosOrden.get(j - 1);
	                listaEnterosOrden.set(j - 1, listaEnterosOrden.get(j));
	                listaEnterosOrden.set(j, temporal);
	            }
	        }
	    }
	    int cantidadOrden = 0;
	    for (Integer integer : listaEnterosOrden) {
	    		 arregloreflector[cantidadOrden] = integer;
	    		 cantidadOrden++;

		}
	    
	    System.out.print("Valor mayor "+arregloreflector[0]);
	    
	    for (int i = 0; i < arregloreflectorSOrden.length; i++) {
			if (arregloreflector[0] == arregloreflectorSOrden[i]) {
				System.out.print("posicion mayor "+i);
			}
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
