package com.ada.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraysTester4 {
	
	public static void main(String[] args) throws Exception {
	    
	    List<Integer> listaEnteros = new ArrayList<Integer>();
	    
        
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
    		}
			
		}

        
	    int [] arregloreflector = new int [cantidadArreglo/2];
	    int [] arregloreflector2 = new int [cantidadArreglo/2];
	    int cantidad = 0;
	    int cantidad1 = 0;
	    boolean mitadArreglo = true;
	    for (Integer integer : listaEnteros) {
	    	if ((cantidadArreglo/2)>cantidad &&mitadArreglo) {
	    		 arregloreflector[cantidad] = integer;
	    		 cantidad++;
	    		 
			}else {
				mitadArreglo = false;
				 arregloreflector2[cantidad1] = integer;
				 cantidad1++;
			}
	    	
		}
	    
	    System.out.print("Valor mayor "+Arrays.toString(arregloreflector));
	    System.out.print("Valor mayor "+Arrays.toString(arregloreflector2));
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
