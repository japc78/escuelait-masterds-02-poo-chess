
public class Player {
	private int count = 0;
	private boolean winner;
	private Color color;

	public Player(Color color, Board board) {
		this.color = color;
	}

	public boolean isWinner() {
		// TODO Auto-generated method stub
		return this.winner;
	}

	public void sayMyColor() {
		System.out.println(this.color);
		count++;
		if (count == 5) {
			this.winner = true;
		}
		
	}

	public void sayWinner() {
		System.out.println("I am Winner!!!!!!!!!!!");
		
	}

	public Color getColor() {
		return this.color;
	}

}
