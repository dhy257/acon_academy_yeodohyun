package 팀플1;

public enum Stone {
	BLACK("●"), WHITE("○"), EMPTY(".");

	private final String symbol;

	Stone(String symbol) {
		this.symbol = symbol;
	}

	public String getSymbol() {
		return symbol;
	}

	public Stone getOpponent() {
		if (this == BLACK)
			return WHITE;
		if (this == WHITE)
			return BLACK;
		return EMPTY;
	}
}