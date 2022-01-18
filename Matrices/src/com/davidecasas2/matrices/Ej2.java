/**
 * 
 */
package com.davidecasas2.matrices;

import java.util.Scanner;

/**
 * @author David
 * Dado un array de tamaño (N,M) de enteros, decir si todos sus elementos son cero. 
 */
public class Ej2 {

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
		Matrices.pedir_matriz(matriz);
		
		//boolean res = Matrices.sonTodosCero(matriz);
		
		if (Matrices.sonTodosCero(matriz)) {
			System.out.println("LA matriz solo contiene ceros");
		} else {
			System.out.println("LA matriz tiene numeros distinto de cero");
		}
		Matrices.mostrar_matriz(matriz);

	}

}
