/**
 * 
 */
package com.davidecasas2.matrices;

import java.util.Scanner;

/**
 * @author David
 *
 */
public class Matrices {

	/**
	 * Método que pide una matriz por teclado
	 * @param matriz Matriz a ingresar por teclado
	 */
	public static void pedir_matriz(int matriz[][]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("Introduce el elemento (%d,%d): ", i,j);
				matriz[i][j]=entrada.nextInt();
			}
		}
	}
	
	/**
	 * Método que muestra un matriz por la pantalla
	 * @param matriz la matriz a mostrar.
	 */
	public static void mostrar_matriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("%3d", matriz[i][j]);
			}
			System.out.println();
		}
	}
}
