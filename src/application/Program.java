package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Deus no controle");
		System.out.println();
		
		ChessMatch chessMatch = new ChessMatch();
		//fun�ao para imprimir as pe�as da partida, criamos a classe UI,com m�todo para recber
		//a matriz de pe�as da partiada.
		UI.printBoard(chessMatch.getPieces());

	}
}
