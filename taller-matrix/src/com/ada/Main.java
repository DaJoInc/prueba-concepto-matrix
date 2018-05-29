package com.ada;



import java.util.Scanner;







public class Main {
	
	public static void main(String[] args) throws Exception {


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
		
		String [][] arregloreflector = new String [numeroDelArreglo][numeroDelArregloCol];


		for(int i=0; i<numeroDelArreglo; i++)
		{
			for(int j=0; j<numeroDelArregloCol; j++)
			{
				if (j==0) {
					System.out.print("Introduzca un codigo: "+ j);
				}else {
					System.out.print("Introduzca un ciudad: "+ j);
				}
				
				String n = sc.next();
					arregloreflector[i][j]= n;
	
			}
		}


		

	     for(int i=0; i<numeroDelArreglo; i++)
	     {
	         for(int j=0; j<numeroDelArregloCol; j++)
	         {
	        	 System.out.print("Valor: "+arregloreflector[i][j]);
	        	 
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
