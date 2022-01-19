/**
 * 
 */
package com.davidecasas2.matrices;

/**
 * @author David
 * 8.	Dado un array de tamaño (3,3) de reales, obtener 
 *      el determinante de la matriz así representada.
 */
public class Ej8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int matriz [][]= new int[3][3];
		Matrices.pedir_matriz(matriz);
		
		System.out.println("Tu matriz es ");
		Matrices.mostrar_matriz(matriz);
		
		System.out.println("El determinante de la matriz 3x3 es:"+ 
				Matrices.determinante(matriz));

	}

}
