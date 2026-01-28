package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
 
	
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public Piece[][] getPiece() {
		return pieces;
	}

	public void setPieces(Piece[][] pieces) {
		this.pieces = pieces;
	}
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece pieces(Position position) {
		return pieces[position.getRow()][position.getcolumn()];
	}
	
	public void placePieces(Piece piece, Position position) {
		pieces[position.getRow()][position.getcolumn()] = piece;
		piece.position = position;
	}
}
