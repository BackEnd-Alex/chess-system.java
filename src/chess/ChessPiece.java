package chess;

import boardgame.Piece;
import boardgame.Position;

public class ChessPiece extends Piece {

	private Color color;
	private int moveCount;
	
	public ChessPiece(Position position, Color color) {
		super(position);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
		
}
