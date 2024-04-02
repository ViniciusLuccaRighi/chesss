package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import entities.ChessPosition;


public class ChessPiece extends Piece {
	private Color color;
	private int moveCount;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	public ChessPosition getChessPosition() {
		
	}
	protected boolean isThereOpponentPiece(Position position) {
		
	}
	protected void increaseMoveCount() {
		
	}
	protected void decreaseMoveCount() {
		
	}
	public Color getColor() {
		return color;
	}
}
