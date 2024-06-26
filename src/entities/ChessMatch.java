package entities;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class ChessMatch {
	private Board board;
	private int turn;
	private Color currentPlayer;
	private boolean check;
	private boolean checkMate;
	private ChessPiece enPassantVulnerable;
	private ChessPiece promoted;
	
	public ChessMatch() {
		board = new Board(8,8);
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return mat;
	}
	public boolean[][] possibleMoves(ChessPosition sourPosition){
		
	}
	public ChessPiece performChessMove(ChessPosition sourcePosition,ChessPosition targetPosition) {
		
	}
	public ChessPiece replacePromotedPiece(String type) {
		
	}
	
}
