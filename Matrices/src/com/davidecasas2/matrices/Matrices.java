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
	 * M�todo que pide una matriz por teclado
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
	 * M�todo que muestra un matriz por la pantalla
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
	 * M�todo que incializa una matriz a un valor pasado como par�metro
	 * @param matriz la matriz a inicializar
	 * @param num el valor utilizado en la incializaci�n
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
	 * M�todo de la clase que indica si todos los elemento de un matriz son cero o no 
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
	 * M�todo de la clase que cuenta cuantos n�mreos de la matriz son iguales a uno 
	 * dado como par�metro
	 * @param matriz la matriz a comprobar
	 * @param a el valor a buscar
	 * @return int con el n�mero de ocurrencias
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
	 * Funci�n que calcula si un matriz es tringular superior
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
	 * Funci�n que calcula si un matriz es tringular inferior
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
	
	/**
	 * M�todo que devuelve el mayor elemetno de la matriz
	 * @param m la matriz a comprobar
	 * @return int co el n�mero mayor de la matriz
	 */
	public static int max_valor(int m[][]) {
		int mayor = m[0][0];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (m[i][j] > mayor) {
					mayor = m[i][j];
				}
			}
		}
		return mayor;
	}
	
	/**
	 * M�todo que devuelve el menor elemetno de la matriz
	 * @param m la matriz a comprobar
	 * @return int co el n�mero menor de la matriz
	 */
	public static int min_valor(int m[][]) {
		int menor = m[0][0];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (m[i][j] < menor) {
					menor = m[i][j];
				}
			}
		}
		return menor;
	}
}
