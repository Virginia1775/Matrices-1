/**
 * 
 */
package com.davidecasas2.matrices;

import java.util.Scanner;

/**
 * @author David
 * 9.	Dada un array de tamaño (M,N) de reales, almacenarlo sobre otro array 
 *      de tamaño (N,M) de forma transpuesta, es decir, el elemento (1,2) del 
 *      primer array se almacenará en el elemento (2,1) del segundo. 
 */
public class Ej9 {

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
		
		System.out.println("Tu matriz es ");
		Matrices.mostrar_matriz(matriz);
		
		int traspuesta [][] = Matrices.trasponer(matriz);
		System.out.println("La matriz traspuestas es ");
		Matrices.mostrar_matriz(traspuesta);

	}

}
