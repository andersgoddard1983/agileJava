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

	private enum Color {BLACK, WHITE};
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
	
	public Piece(String color, char characterRepresentation){
		if (color.toUpperCase() == WHITE)
			this.color = Color.WHITE;
		else if (color.toUpperCase() == BLACK)
			this.color = Color.BLACK;
		else
			this.color = null;
		this.characterRepresentation = characterRepresentation;
	}
	
	private Piece(Color color, Type type){
		this.color = color;
		this.type = type;
	}
	
	void setColor(Color color){
		this.color = color;
	}
	
	public Color getColor(){
		return color;
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
			piece.setCharacterRepresentation('.');
		}
		return piece;
	}
	
/*	public static Piece createWhitePawn(){
		return new Piece(Color.WHITE, Type.PAWN);
	}
	
	public static Piece createWhiteRook(){
		return new Piece(Color.WHITE, Type.ROOK);
	}

	public static Piece createWhiteKnight(){
		return new Piece(Color.WHITE, Type.KNIGHT);
	}

	public static Piece createWhiteBishop(){
		return new Piece(Color.WHITE, Type.BISHOP);
	}	
	
	public static Piece createWhiteQueen(){
		return new Piece(Color.WHITE, Type.QUEEN);
	}
	
	public static Piece createWhiteKing(){
		return new Piece(Color.WHITE, Type.KING);
	}	
	
	public static Piece createBlackPawn(){
		return new Piece(Color.BLACK, Type.PAWN);
	}

	public static Piece createBlackRook(){
		return new Piece(Color.BLACK, Type.ROOK);
	}

	public static Piece createBlackKnight(){
		return new Piece(Color.BLACK, Type.KNIGHT);
	}

	public static Piece createBlackBishop(){
		return new Piece(Color.BLACK, Type.BISHOP);
	}

	public static Piece createBlackQueen(){
		return new Piece(Color.BLACK, Type.QUEEN);
	}

	public static Piece createBlackKing(){
		return new Piece(Color.BLACK, Type.KING);
	}
	
*/

	public static Piece noPiece(){
		Piece noPiece = new Piece(null, Type.NO_PIECE);
		noPiece.setCharacterRepresentation('.');
		return noPiece;
	}
}