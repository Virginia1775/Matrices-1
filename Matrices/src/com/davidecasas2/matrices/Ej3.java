/**
 * 
 */
package com.davidecasas2.matrices;

import java.util.Scanner;

/**
 * @author David
 * 3.	Dado un array de tamaño (N,M) de reales, decir cuántos elementos tiene igual 
 *      a un número A dado.
 */
public class Ej3 {

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
		
		System.out.println("¿Qué número quieres buscar?:");
		int num = entrada.nextInt();
		
		int veces = Matrices.cuantos_son_a(matriz, num);
		
		System.out.printf("El numero %d aparece en la matriz %d veces", num, veces);
			//	Matrices.cuantos_son_a(matriz, num));

	}

}
