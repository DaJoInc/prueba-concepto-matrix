package com.ada.matrix.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MatrixTester10 {
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






	     for(int i=0; i<numeroDelArreglo; i++)
	     {
	        for(int j=0; j<numeroDelArregloCol; j++)
	        {
	            for(int x=0; x<numeroDelArreglo;x++)
	            {
	                for(int y=0; y<numeroDelArregloCol; y++)
	                {
	                    if(arregloreflector[i][j]>arregloreflector[x][y])
	                    {
	                    	temporal=arregloreflector[i][j];
	                        arregloreflector[i][j]=arregloreflector[x][y];
	                        arregloreflector[x][y]=temporal;
	                    }
	 
	                }
	            }
	         }
	    }
		
		List<Integer> listaInteger = new ArrayList<>();

	     for(int i=0; i<numeroDelArreglo; i++)
	     {
	         for(int j=0; j<numeroDelArregloCol; j++)
	         {
	        		 listaInteger.add( arregloreflector[i][j]);
	         }
	     }
	     
		    int [] arregloreflectores = new int [listaInteger.size()];
		    int cantidad = 0;
		    int cantidadCero = 0;
		    int cantidadPo = 0;
		    int cantidadNe = 0;
		    for (Integer integer : listaInteger) {
		    	if (integer==0) {
		    		cantidadCero++;
				}if (integer>0) {
					cantidadPo++;
				} else {
					cantidadNe++;
				}
		    		 arregloreflectores[cantidad] = integer;
		    		 cantidad++;

			}
	     
		    System.out.println(Arrays.toString(arregloreflectores));
		    System.out.print("Valor  igual cero : " + cantidadCero);
		    System.out.print("Valor positivos: " +cantidadPo);
		    System.out.print("Valor negativos : "+ cantidadNe);
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
