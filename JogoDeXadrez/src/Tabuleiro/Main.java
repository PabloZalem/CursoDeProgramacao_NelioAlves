package Tabuleiro;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PartidaDeXadrez xadrez = new PartidaDeXadrez();
		Scanner sc = new Scanner(System.in);
		List<PecaDeXadrez> capturados = new ArrayList<>();
		
		while(!xadrez.getChequeMate()) {
			try {
				UI.imprimirPartida(xadrez,capturados);
				System.out.println();
				System.out.print("Origem: ");
				PosicaoNoXadrez origem = UI.leiaAPosicaoDoXadrez(sc);
				
				boolean[][] possivelMovimento = xadrez.possiveisMovimentos(origem);
				UI.printBoard(null);
				UI.printBoard(xadrez.getPecas(), possivelMovimento);
				
				System.out.println();
				System.out.print("Destino: ");
				PosicaoNoXadrez destino = UI.leiaAPosicaoDoXadrez(sc);
				
				PecaDeXadrez pecaCapturada = xadrez.performanceParaMoverXadrez(origem, destino);
				
				if (pecaCapturada != null) {
					capturados.add(pecaCapturada);
				}
			}catch(XadrezException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
		
		UI.imprimirPartida(xadrez, capturados);
	}
}
