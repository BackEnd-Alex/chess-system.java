package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Deus no controle");
		System.out.println();
		
		ChessMatch chessMatch = new ChessMatch();
		//funcao para imprimir as pecas da partida, criamos a classe UI,com metodo para receber
		//a matriz de pecas da partida.
		UI.printBoard(chessMatch.getPieces());
		
	}
}
