/**
 * 
 */
package com.davidecasas2.matrices;

import java.util.Scanner;

/**
 * @author David
 * 4.	Dado un array de tamaño (N,M) de reales, decir si la matriz así representada 
 *      es triangular superior. 
 */
public class Ej4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuantas el tamaño de la tu matriz cuadrada?:");
		int dim = entrada.nextInt();
		
		
		
		int matriz [][]= new int[dim][dim];
		Matrices.pedir_matriz(matriz);
		
		System.out.println("Tu matriz es ");
		Matrices.mostrar_matriz(matriz);
		
		if (Matrices.esTRiangularSup(matriz)) {
			System.out.println("La matriz es triangulas superior");
		} else {
			System.out.println("La matriz NO es triangulas superior");
		}

	}

}
