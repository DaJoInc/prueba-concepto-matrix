/*
 * MIT License 
 * 
 * Copyright (c) 2018 Ownk
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package com.ada.matrix.second;

import java.util.Scanner;

/**
 *
 * <h1>MatrixTester6</h1>
 *
 * Description
 *
 * @author DavidPiracoca (Ownk) 
 * @version 1.0
 * 
 */
public class MatrixTester6 {

	public static void main(String[] args) throws Exception {

		int temporal = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int cantidadMatrix=0;        
		int numeroDelArreglo=0;
		System.out.print("Introduzca un cantidad matrix filas ");
		cantidadMatrix = sc.nextInt();
		
		if (isNumeric(String.valueOf(cantidadMatrix))) {
			numeroDelArreglo = cantidadMatrix;
		}else {
			throw new Exception("El valor no es valido");
		}
		
		int cantidadMatrixCol=0;   
		int numeroDelArregloCol=0;
		System.out.print("Introduzca un cantidad matrix columnas ");
		cantidadMatrixCol = sc.nextInt();
		if (isNumeric(String.valueOf(cantidadMatrixCol))) {
			numeroDelArregloCol = cantidadMatrixCol;
		}else {
			throw new Exception("El valor no es valido");
		}
		
		int [][] arregloreflector = new int [numeroDelArreglo][numeroDelArregloCol];


		for(int i=0; i<numeroDelArreglo; i++)
		{
			for(int j=0; j<numeroDelArregloCol; j++)
			{
				System.out.print("Introduzca un número entero: ");
				int n = sc.nextInt();
				if (isNumeric(String.valueOf(n))) {
					arregloreflector[i][j]= n;
				}else {
					System.out.print("Valor no es valido: ");
					j--;
				}
			}
		}
		 int temp2 = 0;
		 int mayor = 0;

	     for(int i=0; i<numeroDelArreglo; i++)
	     {
	    	 int temp = 0; 
	    	
	         for(int j=0; j<numeroDelArregloCol; j++)
	         {
	        	 temp = temp + arregloreflector[i][j];
	         }
	         System.out.print("Valor: "+temp);
	         temp2 = temp;
	         if(mayor >= temp) {
	        	 mayor = mayor;
	         }else if(temp2 >= temp){
	        	 mayor = temp;
	         }
	     }
	     System.out.println("este es el mayor: "+ mayor);
	     
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
