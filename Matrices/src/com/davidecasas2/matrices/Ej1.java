/**
 * 
 */
package com.davidecasas2.matrices;

import java.util.Scanner;

/**
 * @author David
 * 1.Dado un array de tamaño (N,M) de enteros, inicializarlo a un valor dado A. 
 */
public class Ej1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int filas, columnas;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuantas filas quieres?:");
		filas = entrada.nextInt();
		
		System.out.println("¿Cuantas columnas quieres?:");
		columnas = entrada.nextInt();
		
		int matriz [][]= new int[filas][columnas];
		
		System.out.println("¿A que valor incializamos la matriz?:");
		int valor = entrada.nextInt();
		
		Matrices.incializar(matriz, valor);
		
		System.out.println("La matriz incializada es ");
		Matrices.mostrar_matriz(matriz);
		

	}

}
