package pieces;

public class Piece {
	final static String white = "white";
	final static String black = "black";	

	String color;
	char characterRepresentation;
	
	public Piece(String color, char characterRepresentation){
		this.color = color;
		this.characterRepresentation = characterRepresentation;
	}
	
	String getColor(){
		return color;
	}
	
	public char getCharacterRepresentation(){
		return characterRepresentation;
	}
	
	boolean isWhite(){
		return color == white;
	}
	
	boolean isBlack(){
		return color == black;
	}
}