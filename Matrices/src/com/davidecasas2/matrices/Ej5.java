/**
 * 
 */
package com.davidecasas2.matrices;

import java.util.Scanner;

/**
 * @author David
 * 4.	Dado un array de tama�o (N,M) de reales, decir si la matriz as� representada 
 *      es triangular inferior. 
 */
public class Ej5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("�Cuantas el tama�o de la tu matriz cuadrada?:");
		int dim = entrada.nextInt();
		
		
		
		int matriz [][]= new int[dim][dim];
		Matrices.pedir_matriz(matriz);
		
		System.out.println("Tu matriz es ");
		Matrices.mostrar_matriz(matriz);
		
		if (Matrices.esTRiangularInf(matriz)) {
			System.out.println("La matriz es triangulas inferior");
		} else {
			System.out.println("La matriz NO es triangulas inferior");
		}

	}

}
