package Tabuleiro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PartidaDeXadrez {
	private int turno;
	private Cor atualjogador;
	private Board board;
	private boolean check;
	private boolean chequeMate;

	private List<Peca> pecaNoTabuleiro = new ArrayList<>();
	private List<Peca> pecasCapturadas = new ArrayList<>();

	public PartidaDeXadrez() {
		board = new Board(8, 8);
		turno = 1;
		atualjogador = Cor.BRANCO;
		setupInicial();
	}

	public boolean getCheck() {
		return check;
	}

	public int getTurno() {
		return turno;
	}

	public Cor getAtualJogador() {
		return atualjogador;
	}

	public boolean getChequeMate() {
		return chequeMate;
	}

	public PecaDeXadrez[][] getPecas() {
		PecaDeXadrez[][] mat = new PecaDeXadrez[board.getLinhas()][board.getColunas()];
		for (int i = 0; i < board.getLinhas(); i++) {
			for (int j = 0; j < board.getColunas(); j++) {
				mat[i][j] = (PecaDeXadrez) board.peca(i, j);
			}
		}
		return mat;
	}

	public boolean[][] possiveisMovimentos(PosicaoNoXadrez posicaoDeOrigem) {
		Posicao posicao = posicaoDeOrigem.ParaPosicao();
		validarAPosicaoDeInicio(posicao);
		return board.peca(posicao).possiveisMovimentos();
	}

	public PecaDeXadrez performanceParaMoverXadrez(PosicaoNoXadrez posicaoDeOrigem, PosicaoNoXadrez posicaoDeDestino) {
		Posicao origem = posicaoDeOrigem.ParaPosicao();
		Posicao destino = posicaoDeDestino.ParaPosicao();
		validarAPosicaoDeInicio(origem);
		validarAPosicaoFinal(origem, destino);
		Peca capturaDaPeca = fazerOMovimento(origem, destino);

		if (testeCheck(atualjogador)) {
			desfazerMovimento(origem, destino, capturaDaPeca);
			throw new XadrezException("Voce nao pode se colocar em cheque");
		}

		check = (testeCheck(oponente(atualjogador))) ? true : false;

		if (testeChequeMate(oponente(atualjogador))) {
			chequeMate = true;
		} else {
			proximoTurno();
		}

		return (PecaDeXadrez) capturaDaPeca;
	}

	private void validarAPosicaoFinal(Posicao origem, Posicao destino) {
		if (!board.peca(origem).possivelMovimento(destino)) {
			throw new XadrezException("A peca escolhida nao pode ser mover para a posicao de destino");
		}
	}

	private Peca fazerOMovimento(Posicao origem, Posicao destino) {
		Peca p = board.removerPeca(origem);
		Peca pecaCapturada = board.removerPeca(destino);
		board.lugarDaPeca(p, destino);

		if (pecaCapturada != null) {
			pecaNoTabuleiro.remove(pecaCapturada);
			pecasCapturadas.add(pecaCapturada);
		}

		return pecaCapturada;
	}

	private void desfazerMovimento(Posicao origem, Posicao destino, Peca peca) {
		Peca p = board.removerPeca(destino);
		board.lugarDaPeca(p, destino);

		if (peca != null) {
			board.lugarDaPeca(peca, destino);
			pecasCapturadas.remove(peca);
			pecaNoTabuleiro.add(peca);
		}
	}

	private void validarAPosicaoDeInicio(Posicao posicao) {
		if (!board.haPeca(posicao)) {
			throw new XadrezException("Não há peça na posicao de origem");
		}

		if (atualjogador != ((PecaDeXadrez) board.peca(posicao)).getCor()) {
			throw new XadrezException("A peça escolhida não é sua");
		}

		if (!board.peca(posicao).TemAlgumaPossibilidadeDeMovimento()) {
			throw new XadrezException("Não tem possibilidade de movimento");
		}
	}

	private void proximoTurno() {
		turno++;
		atualjogador = (atualjogador == Cor.BRANCO) ? Cor.PRETO : Cor.BRANCO;
	}

	private Cor oponente(Cor cor) {
		return (cor == Cor.BRANCO) ? Cor.PRETO : Cor.BRANCO;
	}

	private PecaDeXadrez rei(Cor cor) {
		List<Peca> list = pecaNoTabuleiro.stream().filter(x -> ((PecaDeXadrez) x).getCor() == cor)
				.collect(Collectors.toList());
		for (Peca p : list) {
			if (p instanceof Rei) {
				return (PecaDeXadrez) p;
			}
		}
		throw new IllegalStateException("Nao ha " + cor + "rei no tabuleiro");
	}

	private boolean testeCheck(Cor cor) {
		Posicao posicaoDoRei = rei(cor).getPosicaoNoXadrez().ParaPosicao();
		List<Peca> pecasDoOponente = pecaNoTabuleiro.stream().filter(x -> ((PecaDeXadrez) x).getCor() == oponente(cor))
				.collect(Collectors.toList());

		for (Peca p : pecasDoOponente) {
			boolean[][] mat = p.possiveisMovimentos();
			if (mat[posicaoDoRei.getLinha()][posicaoDoRei.getColuna()]) {
				return true;
			}
		}
		return false;
	}

	private boolean testeChequeMate(Cor cor) {
		if (!testeCheck(cor)) {
			return false;
		}
		List<Peca> list = pecaNoTabuleiro.stream().filter(x -> ((PecaDeXadrez) x).getCor() == cor)
				.collect(Collectors.toList());

		for (Peca p : list) {
			boolean[][] mat = p.possiveisMovimentos();
			for (int i = 0; i < board.getLinhas(); i++) {
				for (int j = 0; j < board.getColunas(); j++) {
					if (mat[i][j]) {
						Posicao origem = ((PecaDeXadrez) p).getPosicaoNoXadrez().ParaPosicao();
						Posicao destino = new Posicao(i, j);
						Peca capturarPeca = fazerOMovimento(origem, destino);
						boolean testeCheque = testeCheck(cor);
						desfazerMovimento(origem, destino, capturarPeca);
						if (!testeCheque) {
							return false;
						}
					}
				}
			}
		}

		return true;
	}

	private void lugarDaNovaPeca(char coluna, int linha, PecaDeXadrez peca) {
		board.lugarDaPeca(peca, new PosicaoNoXadrez(coluna, linha).ParaPosicao());
		pecaNoTabuleiro.add(peca);
	}

	private void setupInicial() {
		lugarDaNovaPeca('b', 6, new Torre(board, Cor.BRANCO));
		lugarDaNovaPeca('e', 8, new Rei(board, Cor.PRETO));
		lugarDaNovaPeca('e', 1, new Rei(board, Cor.BRANCO));
	}
}
