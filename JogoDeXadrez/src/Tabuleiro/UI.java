package Tabuleiro;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UI {

	public static void printBoard(PecaDeXadrez[][] pecas) {
		for (int i = 0; i < pecas.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pecas.length; j++) {
				imprimirPeca(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}

	public static void printBoard(PecaDeXadrez[][] pecas, boolean[][] possiveisMovimentos) {
		for (int i = 0; i < pecas.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pecas.length; j++) {
				imprimirPeca(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}

	public static PosicaoNoXadrez leiaAPosicaoDoXadrez(Scanner sc) {
		try {
			String s = sc.nextLine();
			char coluna = s.charAt(0);
			int linha = Integer.parseInt(s.substring(1));
			return new PosicaoNoXadrez(coluna, linha);
		} catch (RuntimeException e) {
			throw new InputMismatchException("Erro ao ler valores no xadrez");
		}
	}

	public static void imprimirPartida(PartidaDeXadrez partidaDeXadrez, List<PecaDeXadrez> capturado) {
		printBoard(partidaDeXadrez.getPecas());
		System.out.println();
		System.out.println(capturado);
		System.out.println();
		System.out.println("Turno: " + partidaDeXadrez.getTurno());
		if (!partidaDeXadrez.getChequeMate()) {
			System.out.println("Aguardando jogador: " + partidaDeXadrez.getAtualJogador());
			if (partidaDeXadrez.getCheck()) {
				System.out.println("Voce está em check");
			}
		}else {
			System.out.println("CHEQUE-MATE");
			System.out.println("Vencedor: " + partidaDeXadrez.getAtualJogador());
		}
	}

	private static void imprimirPeca(PecaDeXadrez xadrez) {
		if (xadrez == null) {
			System.out.print("-");
		} else {
			System.out.print(xadrez);
		}
		System.out.print(" ");
	}

	private static void imprimirPecasCapturdas(List<PecaDeXadrez> capturado) {
		List<PecaDeXadrez> branco = capturado.stream().filter(x -> x.getCor() == Cor.BRANCO)
				.collect(Collectors.toList());
		List<PecaDeXadrez> preto = capturado.stream().filter(x -> x.getCor() == Cor.PRETO).collect(Collectors.toList());

		System.out.println("Pecas capturadas: ");
		System.out.print("Branco: ");
		System.out.println(Arrays.toString(branco.toArray()));
	}
}
