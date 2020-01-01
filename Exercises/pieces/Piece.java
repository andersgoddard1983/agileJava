package pieces;

import static util.ConstantUtil.WHITE;
import static util.ConstantUtil.BLACK;
import static util.ConstantUtil.PAWN;
import static util.ConstantUtil.ROOK;
import static util.ConstantUtil.KNIGHT;
import static util.ConstantUtil.BISHOP;
import static util.ConstantUtil.QUEEN;
import static util.ConstantUtil.KING;
import static util.ConstantUtil.PAWN_REPRESENTATION;
import static util.ConstantUtil.ROOK_REPRESENTATION;
import static util.ConstantUtil.KNIGHT_REPRESENTATION;
import static util.ConstantUtil.BISHOP_REPRESENTATION;
import static util.ConstantUtil.QUEEN_REPRESENTATION;
import static util.ConstantUtil.KING_REPRESENTATION;

public class Piece {

	private enum Color {BLACK, WHITE, NO_COLOR};
	enum Type {PAWN, ROOK, KNIGHT, BISHOP, KING, QUEEN, NO_PIECE}
	Color color;
	Type type;
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
			piece.setCharacterRepresentation(PAWN_REPRESENTATION);
		} 
		if (type.toUpperCase() == ROOK){
			piece.setType(Type.ROOK);
			piece.setCharacterRepresentation(ROOK_REPRESENTATION);
		}
		if (type.toUpperCase() == KNIGHT){
			piece.setType(Type.KNIGHT);
			piece.setCharacterRepresentation(KNIGHT_REPRESENTATION);
		}
		if (type.toUpperCase() == BISHOP){
			piece.setType(Type.BISHOP);
			piece.setCharacterRepresentation(BISHOP_REPRESENTATION);
		}
		if (type.toUpperCase() == QUEEN){
			piece.setType(Type.QUEEN);
			piece.setCharacterRepresentation(QUEEN_REPRESENTATION);
		}
		if (type.toUpperCase() == KING){
			piece.setType(Type.KING);
			piece.setCharacterRepresentation(KING_REPRESENTATION);
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