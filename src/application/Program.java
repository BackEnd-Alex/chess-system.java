package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Deus no controle");
		System.out.println();
		
		ChessMatch chessMatch = new ChessMatch();
		//funçao para imprimir as peças da partida, criamos a classe UI,com método para recber
		//a matriz de peças da partiada.
		UI.printBoard(chessMatch.getPieces());

	}
}
