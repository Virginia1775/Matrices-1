/**
 * 
 */
package com.davidecasas2.matrices;

import java.util.Scanner;

/**
 * @author David
 * 10.	Realizar un programa para multiplicar matrices 
 */
public class Ej10 {

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
		
		int matriz1 [][]= new int[filas][columnas];
		Matrices.pedir_matriz(matriz1);
		
		System.out.println("¿Cuantas columnas quieres para la segunda?:");
		int columnas2 = entrada.nextInt();
		int matriz2 [][]= new int[columnas][columnas2];
		Matrices.pedir_matriz(matriz2);
		
		System.out.println("La matriz1 es ");
		Matrices.mostrar_matriz(matriz1);
		
		System.out.println("La matriz2 es ");
		Matrices.mostrar_matriz(matriz2);
		int matrizRes [][]= Matrices.productoMatrices(matriz1, matriz2);
		
		System.out.println("La matriz prtoducto es ");
		Matrices.mostrar_matriz(matrizRes);

	}

}
