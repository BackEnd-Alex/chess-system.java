package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		super();
		this.board = board;
		position= null;
	}
//SOMENTE CLASS E SUBCLASS  DENTRO DO MESMO PACOTE PODEM ACESSAR AO BOARD E PIECE
	protected Board getBoard() {
		return board;
	}

}
