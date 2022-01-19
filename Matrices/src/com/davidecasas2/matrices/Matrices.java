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
	
	/**
	 * Método que incializa una matriz a un valor pasado como parámetro
	 * @param matriz la matriz a inicializar
	 * @param num el valor utilizado en la incialización
	 * @
	 */
	public static void incializar(int matriz[][], int num) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j]=num;
			}
		}
	}
	
	/**
	 * Método de la clase que indica si todos los elemento de un matriz son cero o no 
	 * @param matriz la matriz a comprobar
	 * @return true si son todos cero y falso en caso contrario
	 */
	public static boolean sonTodosCero(int matriz [][]) {
		boolean soncero=true;
		
		for (int i = 0; i < matriz.length && soncero; i++) {
			for (int j = 0; j < matriz[0].length && soncero; j++) {
				if (matriz[i][j]!=0) {
					soncero=false;
				} 
			}
		}
		return soncero;
	}
	
	/**
	 * Método de la clase que cuenta cuantos númreos de la matriz son iguales a uno 
	 * dado como parámetro
	 * @param matriz la matriz a comprobar
	 * @param a el valor a buscar
	 * @return int con el número de ocurrencias
	 */
	public static int cuantos_son_a(int matriz[][], int a) {
		int contador = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j]==a) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	/**
	 * Función que calcula si un matriz es tringular superior
	 * @param matriz la matriz a calcular
	 * @return true si triangular superior y false en caso contrario
	 */
	public static boolean esTRiangularSup(int matriz [][]) {
		boolean triangsup=true;
		
		for (int i = 1; i < matriz.length && triangsup; i++) {
			for (int j = 0; j <i && triangsup; j++) {
				if (matriz[i][j]!=0) {
					triangsup=false;
				} 
			}
		}
		return triangsup;
	}
	
	/**
	 * Función que calcula si un matriz es tringular inferior
	 * @param matriz la matriz a calcular
	 * @return true si triangular superior y false en caso contrario
	 */
	public static boolean esTRiangularInf(int matriz [][]) {
		boolean trianginf=true;
		
		for (int i = 0; i < matriz.length-1 && trianginf; i++) {
			for (int j = i+1; j <matriz.length && trianginf; j++) {
				if (matriz[i][j]!=0) {
					trianginf=false;
				} 
			}
		}
		return trianginf;
	}
	
	public static boolean esDiagonal(int m[][]) {
		return esTRiangularInf(m) && esTRiangularSup(m);
	}
}
