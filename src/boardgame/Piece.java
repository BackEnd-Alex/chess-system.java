package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Position position) {

		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

}
