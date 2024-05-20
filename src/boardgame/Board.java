package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;

	public Board(int rows, int columns) {
<<<<<<< HEAD
		if( rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 rows and 1 columns");
=======
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
>>>>>>> c629ccd0eb220b8c94488d25691e76a52aae107d
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
<<<<<<< HEAD
		
	public Piece piece (int row, int column) {
		
=======

	public Piece piece(int row, int column) {
>>>>>>> c629ccd0eb220b8c94488d25691e76a52aae107d
		if(!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}

	// SOBRECARGA DO METODO PIECE
<<<<<<< HEAD
	public Piece piece (Position position) {
		
		if(!positionExists(position)) {
=======
	public Piece piece(Position position) {

		if (!positionExists(position)) {
>>>>>>> c629ccd0eb220b8c94488d25691e76a52aae107d
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
<<<<<<< HEAD
	public void placePiece(Piece piece, Position position){
		
		if(thereIsApiece(position)) {
			throw new BoardException("There is already a piece on position" + position);
		}
		
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
		}
	private boolean positionExists(int row , int column) {
		
		return row >= 0 && row < rows  && column >= 0 && column< columns;
	}
	public boolean positionExists(Position position) {
		
		return positionExists(position.getRow(),position.getColumn());
	}
=======

	public void placePiece(Piece piece, Position position) {
		if(thereIsApiece(position)) {
			throw new BoardException("There is already a piece on position" + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 & column < columns;
	}

>>>>>>> c629ccd0eb220b8c94488d25691e76a52aae107d
	public boolean thereIsApiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
<<<<<<< HEAD
		 return piece(position) != null;
	}
=======
		return piece(position) != null;
	}

>>>>>>> c629ccd0eb220b8c94488d25691e76a52aae107d
}
