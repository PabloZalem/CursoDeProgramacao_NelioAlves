package Matrizes;

import java.util.Scanner;

public class ExercicioProposto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for(int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.println("Posicao: " + i + ", " + j + ":");
					
					if(j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}else if (i > 0) {
						System.out.println("Cima: " + mat[i-1][j]);
					}else if (j < mat[i].length - 1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}else if (j < mat.length-1) {
						System.out.println("Baixo: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
}
