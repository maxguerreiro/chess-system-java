package boardgame;

public class Board {
	
	private int rows;
	private int Columns;
	private Piece[][] piece;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		Columns = columns;
		piece = new Piece[rows][columns];
	}
 
	
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return Columns;
	}

	public void setColumns(int columns) {
		Columns = columns;
	}

	public Piece[][] getPiece() {
		return piece;
	}

	public void setPiece(Piece[][] piece) {
		this.piece = piece;
	}
	
	public Piece piece(int row, int column) {
		return piece[row][column];
	}
	
	public Piece piece(Position position) {
		return piece[position.getRow()][position.getcolumn()];
	}
}
