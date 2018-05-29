package com.ada;

import java.util.Scanner;

import com.ada.dao.CityDaos;
import com.ada.dto.CityDao;
import com.ada.mybatis.MyBatisConnectionFactory;

public class Main2 {

	public static void main(String[] args) throws Exception {

		CityDaos cityDaos= new CityDaos(MyBatisConnectionFactory.getSqlSessionFactory());

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
	     		CityDao city = new CityDao();
                city.setId(arregloreflector[i][0]);
                city.setName(arregloreflector[i][1]);
		        cityDaos.insert(city);
	        	 
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
	/**
	public static void main(String args[]){
		

		CityDaos cityDaos= new CityDaos(MyBatisConnectionFactory.getSqlSessionFactory());


		CityDao city = new CityDao();
                city.setId(43);
		city.setName("Person 3");
		

		cityDaos.insert(city);

                city.setId(44);
		city.setName("city 4");	

		int id = cityDaos.insert(city);
		

		cityDaos.selectById(id);
		
	
		List<CityDao> citys = cityDaos.selectAll();
		
	
		for(int i = 0; i < citys.size(); i++){
			citys.get(i).setName("Person Name "+i);
			//( 4 ) update citys
			cityDaos.update(citys.get(i));
		}
	
		citys = cityDaos.selectAll();



	}
	*/
}
