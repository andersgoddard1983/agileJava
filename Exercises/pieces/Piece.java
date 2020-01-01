package pieces;

public class Piece {
	final static String WHITE = "WHITE";
	final static String BLACK = "BLACK";
	final static String PAWN = "PAWN";
	final static String ROOK = "ROOK";
	final static String KNIGHT = "KNIGHT";
	final static String BISHOP = "BISHOP";
	final static String QUEEN = "QUEEN";
	final static String KING = "KING";	

	private enum Color {BLACK, WHITE, NO_COLOR};
	enum Type {PAWN, ROOK, KNIGHT, BISHOP, KING, QUEEN, NO_PIECE}
	Color color;
	Type type;
	public static char PAWN_REPRESENTATION = 'p';
	public static char ROOK_REPRESENTATION = 'r';
	public static char KNIGHT_REPRESENTATION = 'n';
	public static char BISHOP_REPRESENTATION = 'b';
	public static char QUEEN_REPRESENTATION = 'q';
	public static char KING_REPRESENTATION = 'k';
	char characterRepresentation;
	double strength;
	
	public Piece(String color, char characterRepresentation){
		if (color.toUpperCase().equals(WHITE))
			this.color = Color.WHITE;
		else if (color.toUpperCase().equals(BLACK))
			this.color = Color.BLACK;
		else
			this.color = Color.NO_COLOR;
		this.characterRepresentation = characterRepresentation;
	}
	
	private Piece(Color color, Type type){
		this.color = color;
		this.type = type;
	}
	
	public void setStrength(double strength){
		this.strength = strength;
	}
	
	public double getStrength(){
		return strength;
	}
	
	void setColor(Color color){
		this.color = color;
	}
	
	public String getColor(){
		return color.toString();
	}
	
	public void setCharacterRepresentation(char characterRepresentation){
		this.characterRepresentation = characterRepresentation;
	}
	
	public char getCharacterRepresentation(){
		return characterRepresentation;
	}
	
	void setBlackCharacterRepresentation(){
		this.characterRepresentation = Character.toUpperCase(this.characterRepresentation);
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
	public Type getType() {
		return type;
	}
	
	boolean isWhite(){
		return color == Color.WHITE;
	}
	
	boolean isBlack(){
		return color == Color.BLACK;
	}
	
	public static Piece createPiece(String color, String type){
		Piece piece = new Piece(null, Type.NO_PIECE);
		if (type.toUpperCase() == PAWN){
			piece.setType(Type.PAWN);
			piece.setCharacterRepresentation('p');
		} 
		if (type.toUpperCase() == ROOK){
			piece.setType(Type.ROOK);
			piece.setCharacterRepresentation('r');
		}
		if (type.toUpperCase() == KNIGHT){
			piece.setType(Type.KNIGHT);
			piece.setCharacterRepresentation('n');
		}
		if (type.toUpperCase() == BISHOP){
			piece.setType(Type.BISHOP);
			piece.setCharacterRepresentation('b');
		}
		if (type.toUpperCase() == QUEEN){
			piece.setType(Type.QUEEN);
			piece.setCharacterRepresentation('q');
		}
		if (type.toUpperCase() == KING){
			piece.setType(Type.KING);
			piece.setCharacterRepresentation('k');
		}
		if (color.toUpperCase() == WHITE)
			piece.setColor(Color.WHITE);
		else if (color.toUpperCase() == BLACK){
			piece.setColor(Color.BLACK);
			piece.setBlackCharacterRepresentation();
		}
		else {
			piece.setColor(Color.NO_COLOR);
			piece.setCharacterRepresentation('.');
		}
		return piece;
	}

	public static Piece noPiece(){
		Piece noPiece = new Piece(Color.NO_COLOR, Type.NO_PIECE);
		noPiece.setCharacterRepresentation('.');
		return noPiece;
	}
}