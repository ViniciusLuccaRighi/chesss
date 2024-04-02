package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
	}
	public boolean[][] possibleMoves(){
	
	}
	protected Board getBoard() {
		return board;
	}
	public boolean isThereAnyPossibleMove() {
		
	}
}
