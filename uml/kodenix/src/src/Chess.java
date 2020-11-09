
class Chess {
	
	final int NUMBERS_PIECE_ROOK = 2;
	final int NUMBERS_PIECE_QUEEN = 1;
	final int NUMBERS_PIECE_KING = 1;
	
	private Player[] players = new Player[2];
	private Board board;
	private int turn;
	
	Chess() {
		this.turn = 0;
		this.initializePlayers();
		Piece[] pieces = this.generatePieces();
		this.board = new Board(pieces);
	}
	
	public void play() {
		
		/*do {
			this.players[turn].sayMyColor();
			
			this.changeTurn();
		} while (!this.players[this.turn].isWinner());
		this.players[this.turn].sayWinner();
		*/
		board.show();
		
	}
	
	private void changeTurn() {
		if (this.turn == 0) {
			this.turn=1;
		} else this.turn=0;
		
	}

	private Piece[] generatePieces() {
		Piece[] allPieces = new Piece[8];
	
		allPieces[0] = new Rook(players[0]);
		allPieces[1] = new Rook(players[0]);
		allPieces[2] = new Queen(players[0]);
		allPieces[3] = new King(players[0]);
		
		allPieces[4] = new Rook(players[1]);
		allPieces[5] = new Rook(players[1]);
		allPieces[6] = new Queen(players[1]);
		allPieces[7] = new King(players[1]);
		
		return allPieces;
	}

	private void initializePlayers() {
		players[0] = new Player(Color.WHITE, board);
		players[1] = new Player(Color.BLACK, board);
	}
	

	public static void main(String[] args) {
		Chess chess = new Chess();
		chess.play();

	}
	
	

}
