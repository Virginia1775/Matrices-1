/**
 * 
 */
package com.davidecasas2.matrices;

import java.util.Scanner;

/**
 * @author David
 * 6.	Dado un array de tamaño (N,M) de enteros, buscar el máximo valor almacenado.
 */
public class Ej6 {

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
		
		System.out.printf("El menor elemento es %d",Matrices.min_valor(matriz));

	}

}
