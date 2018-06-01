package com.ada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main4 {

public static void main(String[] args) throws Exception {
	    
	    List<String[]> listaEnteros = new ArrayList<String[]>();
	    
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int cantidadArreglo=0;        
        int numeroDelArreglo=0;
        System.out.print("Introduzca un cantidad arreglo ");
        cantidadArreglo = sc.nextInt();
	    
        if (isNumeric(String.valueOf(cantidadArreglo))) {
        	numeroDelArreglo = cantidadArreglo;
		}else {
			throw new Exception("El valor no es valido");
		}
        
        for (int i = 0; i < numeroDelArreglo; i++) {
        	String [] arregloreflector = new String [1];
            System.out.print("Introduzca un codigo ciudad: ");
            arregloreflector[0] = sc.next();
            
            listaEnteros.add(arregloreflector);
			
		}

        

	    String [] arregloreflector = new String [cantidadArreglo];
	    int cantidad = 0;
	    for (String[] integer : listaEnteros) {
	    		 arregloreflector[cantidad] = integer[0];
	    		 cantidad++;

		}
	    System.out.println("Valor mayor "+Arrays.toString(arregloreflector));
	    Stack<String> pila = new Stack<String>();
	    
	    for (int i = 0; i < arregloreflector.length; i++) {
	    	 pila.push(arregloreflector[i]);
			
		}
	    
	    while (!pila.empty())
	    	  System.out.println(pila.pop());
	    
	    
	    
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

