package chess;

import java.util.*;
import pieces.*;
import util.StringUtil;
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

class Board {
	
	final static int LENGTH_OF_RANK = 8;
	
	final static double QUEEN_STRENGTH = 9;
	final static double ROOK_STRENGTH = 5;
	final static double BISHOP_STRENGTH = 3;
	final static double KNIGHT_STRENGTH = 2.5;
	final static double PAWN_STRENGTH = 1;
	final static double PAWN_HALF_STRENGTH = 0.5;
		
	private ArrayList<Piece> pieces = new ArrayList<Piece>();
	private ArrayList<Piece> firstRank = new ArrayList<Piece>();
	private ArrayList<Piece> secondRank = new ArrayList<Piece>();
	private ArrayList<Piece> thirdRank = new ArrayList<Piece>();
	private ArrayList<Piece> fourthRank = new ArrayList<Piece>();
	private ArrayList<Piece> fifthRank = new ArrayList<Piece>();
	private ArrayList<Piece> sixthRank = new ArrayList<Piece>();
	private ArrayList<Piece> seventhRank = new ArrayList<Piece>();
	private ArrayList<Piece> eighthRank = new ArrayList<Piece>();
	
	private	ArrayList<ArrayList<Piece>> board = new ArrayList<ArrayList<Piece>>();
		
	Board(){
		initialize();
	}
	
	void initialize(){
		createRanks();
		createFiles();
	}
	
	void createRanks(){
		board.add(eighthRank);		
		board.add(seventhRank);
		board.add(sixthRank);
		board.add(fifthRank);
		board.add(fourthRank);
		board.add(thirdRank);
		board.add(secondRank);
		board.add(firstRank);

	}
	
	void createFiles(){
		createFile(eighthRank);
		createFile(seventhRank);
		createFile(sixthRank);
		createFile(fifthRank);
		createFile(fourthRank);
		createFile(thirdRank);
		createFile(secondRank);
		createFile(firstRank);
	}
	
	void createFile(ArrayList<Piece> rank){
		for (int i = 0; i < LENGTH_OF_RANK; i++){
		addNoPiece(rank);
		}
	}
	
	int pieceCount(){
		return pieces.size();
	}
	
	int pieceCount(String color, char characterRepresentation){
		Piece checkPiece = new Piece(color, characterRepresentation);
		int count = 0;
		for (Piece piece : pieces){
			if (piece.getCharacterRepresentation() == checkPiece.getCharacterRepresentation())
				count += 1;
		}
		return count;
	}
	
		public void setPieceStrength(String color){
		for (ArrayList<Piece> rank : board){
			for (Piece piece : rank){
				if (piece.getColor().equals(color.toUpperCase())){
					if (Character.toLowerCase(piece.getCharacterRepresentation()) == QUEEN_REPRESENTATION)
						piece.setStrength(QUEEN_STRENGTH);
					if (Character.toLowerCase(piece.getCharacterRepresentation()) == ROOK_REPRESENTATION)
						piece.setStrength(ROOK_STRENGTH);
					if (Character.toLowerCase(piece.getCharacterRepresentation()) == BISHOP_REPRESENTATION)
						piece.setStrength(BISHOP_STRENGTH);
					if (Character.toLowerCase(piece.getCharacterRepresentation()) == KNIGHT_REPRESENTATION)
						piece.setStrength(KNIGHT_STRENGTH);
				}
			}
		}
		setPawnStrength(color);
	}
	
	void setPawnStrength(String color){
		char characterRepresentation = PAWN_REPRESENTATION;
		int pawnsAtIndex[] = new int[LENGTH_OF_RANK];
		
		int count = 0;
		
		if (color.toUpperCase().equals(BLACK))
			characterRepresentation = Character.toUpperCase(characterRepresentation);
				
		for (ArrayList<Piece> rank : board){
			for (Piece piece : rank){
				if (piece.getCharacterRepresentation() == characterRepresentation){
					pawnsAtIndex[count] = pawnsAtIndex[count] + 1;
				}
				count += 1;
			}
			count = 0;
		}
		
		for (ArrayList<Piece> rank : board){
			for (Piece piece : rank){
				if (piece.getCharacterRepresentation() == characterRepresentation){
					if (pawnsAtIndex[count] > 1){
						piece.setStrength(PAWN_HALF_STRENGTH);
					}
					else {
						piece.setStrength(PAWN_STRENGTH);
					}
				}
			count += 1;
			} 
			count = 0;
		}
	}
	
	public double getStrength(String color){
		double strength = 0;
		
		for (ArrayList<Piece> rank : board){
			for (Piece piece : rank){
				if (piece.getColor().equals(color.toUpperCase())){
					strength += piece.getStrength();					
				}
			}
		}
		return strength;
	}
	
	void addNoPiece(ArrayList<Piece> rank){
		Piece blank = Piece.noPiece();
		rank.add(blank);
	}
	
	String getRank(ArrayList<Piece> pieces){
		StringBuilder buffer = new StringBuilder();
		for (Piece piece : pieces){
			buffer.append(piece.getCharacterRepresentation());
		}
		return StringUtil.appendNewLine(buffer.toString());
	}
	
	public char getPieceAtPosition(String location){
		int fileIndex = getFileInt(getFile(location));
		
		String rankIndexString = location.substring(1, 2);
		int rankIndex = Integer.parseInt(rankIndexString)-1;
		
		ArrayList<Piece> rank = board.get(rankIndex);
		Piece piece = rank.get(fileIndex);
		return piece.getCharacterRepresentation();
	}
	
	public void setPieceAtPosition(String location, Piece piece){
		int fileIndex = getFileInt(getFile(location));
		
		String rankIndexString = location.substring(1, 2);
		int rankIndex = Integer.parseInt(rankIndexString)-1;
		
		ArrayList<Piece> rank = board.get(rankIndex);
		rank.set(fileIndex, piece);
		pieces.add(piece);
	}
	
	char getFile (String location){
		return location.charAt(0);
	}
	
	int getFileInt(char file){
		int fileInt = -1;
		if (file == 'a')
			fileInt = 0;
		if (file == 'b')
			fileInt = 1;
		if (file == 'c')
			fileInt = 2;
		if (file == 'd')
			fileInt = 3;
		if (file == 'e')
			fileInt = 4;
		if (file == 'f')
			fileInt = 5;
		if (file == 'g')
			fileInt = 6;
		if (file == 'h')
			fileInt = 7;
		return fileInt;		
	}
	
	String print(){
		return getRank(eighthRank) + getRank(seventhRank) + getRank(sixthRank) + 
				getRank(fifthRank) + getRank(fourthRank) + getRank(thirdRank) + 
				getRank(secondRank) + getRank(firstRank);
	}
}