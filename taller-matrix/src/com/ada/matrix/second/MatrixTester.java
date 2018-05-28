package com.ada.matrix.second;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixTester {
	 @SuppressWarnings({ "resource", "null" })
	public static void main(String[] args) throws Exception {


		int temporal = 0;
		
	    List<Integer> listaEnteros = new ArrayList<Integer>();
	    
        
       
		Scanner sc = new Scanner(System.in);
        int cantidadArreglo1=0;        
        int numeroDelArreglo=0;
        System.out.print("Introduzca un cantidad arreglo ");
        cantidadArreglo1 = sc.nextInt();
	    
        if (isNumeric(String.valueOf(cantidadArreglo1))) {
        	numeroDelArreglo = cantidadArreglo1;
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
	    int [] arregloreflector = new int [cantidadArreglo1];
	    int cantidad = 0;
	    
	    List<int []> arrayVestor = new ArrayList<>();
	    
	    for (Integer integer : listaEnteros) {
	    		 arregloreflector[cantidad] = integer;
	    		 cantidad++;
	    		 
		}
	    int [] arregloreflector3 = null;
	    arregloreflector3 = arregloreflector;
	    arrayVestor.add(arregloreflector3);
	    int [] arregloreflector4 = null;
	    arregloreflector4 = arregloreflector;
	    arrayVestor.add(arregloreflector4);
	    int [] arregloreflector5 = null;
	    arregloreflector5 = arregloreflector;
	    arrayVestor.add(arregloreflector5);
		
		
		

		sc = new Scanner(System.in);
		int cantidadMatrix=0;        
		 numeroDelArreglo=0;
		cantidadMatrix = 3;
		
		if (isNumeric(String.valueOf(cantidadMatrix))) {
			numeroDelArreglo = cantidadMatrix;
		}else {
			throw new Exception("El valor no es valido");
		}
		
		int cantidadMatrixCol=0;   
		int numeroDelArregloCol=0;
		cantidadMatrixCol = cantidadArreglo1;
		if (isNumeric(String.valueOf(cantidadMatrixCol))) {
			numeroDelArregloCol = cantidadMatrixCol;
		}else {
			throw new Exception("El valor no es valido");
		}
		
		int [][] arregloreflectorMAtrix = new int [numeroDelArreglo][numeroDelArregloCol];

		int menu= 0;
		for (int[] is : arrayVestor) {
			

			for(int j=0; j<numeroDelArregloCol; j++)
			{

					arregloreflectorMAtrix[menu][j]= is[j];

			}
			menu ++;
	
		}





	     for(int i=0; i<numeroDelArreglo; i++)
	     {
	        for(int j=0; j<numeroDelArregloCol; j++)
	        {
	            for(int x=0; x<numeroDelArreglo;x++)
	            {
	                for(int y=0; y<numeroDelArregloCol; y++)
	                {
	                    if(arregloreflectorMAtrix[i][j]>arregloreflectorMAtrix[x][y])
	                    {
	                    	temporal=arregloreflectorMAtrix[i][j];
	                    	arregloreflectorMAtrix[i][j]=arregloreflectorMAtrix[x][y];
	                    	arregloreflectorMAtrix[x][y]=temporal;
	                    }
	 
	                }
	            }
	         }
	    }
		
		

	     for(int i=0; i<numeroDelArreglo; i++)
	     {
	         for(int j=0; j<numeroDelArregloCol; j++)
	         {
	        	 System.out.print("Valor: "+arregloreflectorMAtrix[i][j]);
	        	 
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
