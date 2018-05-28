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
 * <h1>MatrixTester4</h1>
 *
 * Description
 *
 * @author DavidPiracoca (Ownk) 
 * @version 1.0
 * 
 */
public class MatrixTester4 {
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
	
	
    System.out.print("Valor: "+arregloreflector[0][0]);
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
