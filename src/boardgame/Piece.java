package boardgame;

public class Piece {
	
protected  Position position;
private Board board;

	public Piece(Position position) {
		
		this.board =board;
		position = null;
	}
		
	protected Board getBoard() {
		return board;
	}


	public possibleMove[][]  Boolean() {
		return true;
		
	}
	
	public boolean possibleMoves( Position position) {
		return false;
				
	}
	public boolean isThereAnyPossibleMove( Position position) {
		return false;
				
	}

}
