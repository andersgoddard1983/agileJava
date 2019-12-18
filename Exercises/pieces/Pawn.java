package pieces;

public class Pawn {
	final static String white = "white";
	final static String black = "black";	

	String color;
	
	public Pawn(String color){
		this.color = color;
	}
	
	public Pawn(){
		this.color = white;
	}
	
	String getColor(){
		return color;
	}
}