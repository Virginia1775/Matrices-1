/**
 * 
 */
package com.davidecasas2.matrices;

import java.util.Scanner;

/**
 * @author David
 * 3.	Dado un array de tama�o (N,M) de reales, decir cu�ntos elementos tiene igual 
 *      a un n�mero A dado.
 */
public class Ej3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int filas, columnas;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("�Cuantas filas quieres?:");
		filas = entrada.nextInt();
		
		System.out.println("�Cuantas columnas quieres?:");
		columnas = entrada.nextInt();
		
		int matriz [][]= new int[filas][columnas];
		Matrices.pedir_matriz(matriz);
		
		System.out.println("Tu matriz es ");
		Matrices.mostrar_matriz(matriz);
		
		System.out.println("�Qu� n�mero quieres buscar?:");
		int num = entrada.nextInt();
		
		int veces = Matrices.cuantos_son_a(matriz, num);
		
		System.out.printf("El numero %d aparece en la matriz %d veces", num, veces);
			//	Matrices.cuantos_son_a(matriz, num));

	}

}
