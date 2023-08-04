package Tabuleiro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PartidaDeXadrez xadrez = new PartidaDeXadrez();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				UI.printBoard(xadrez.getPecas());
				System.out.println();
				System.out.print("Origem: ");
				PosicaoNoXadrez origem = UI.leiaAPosicaoDoXadrez(sc);
				
				System.out.println();
				System.out.print("Destino: ");
				PosicaoNoXadrez destino = UI.leiaAPosicaoDoXadrez(sc);
				
				PecaDeXadrez pecaCapturada = xadrez.performanceParaMoverXadrez(origem, destino);
			}catch(XadrezException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}
}
