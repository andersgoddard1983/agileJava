package chess;

import java.util.*;
import pieces.*;
import util.StringUtil;

class Board {
	
	final static String WHITE = "WHITE";
	final static String BLACK = "BLACK";
	final static String PAWN = "PAWN";
	final static String ROOK = "ROOK";
	final static String KNIGHT = "KNIGHT";
	final static String BISHOP = "BISHOP";
	final static String QUEEN = "QUEEN";
	final static String KING = "KING";	
		
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

	void populateEighthRank(){
		addBlackRook(eighthRank);
		addBlackKnight(eighthRank);
		addBlackBishop(eighthRank);
		addBlackQueen(eighthRank);
		addBlackKing(eighthRank);
		addBlackBishop(eighthRank);
		addBlackKnight(eighthRank);
		addBlackRook(eighthRank);
	}

	void populateSeventhRank(){
		addBlackPawn(seventhRank);
		addBlackPawn(seventhRank);
		addBlackPawn(seventhRank);
		addBlackPawn(seventhRank);
		addBlackPawn(seventhRank);
		addBlackPawn(seventhRank);
		addBlackPawn(seventhRank);
		addBlackPawn(seventhRank);
	}

	void populateSixthRank(){
		addNoPiece(sixthRank);
		addNoPiece(sixthRank);
		addNoPiece(sixthRank);
		addNoPiece(sixthRank);
		addNoPiece(sixthRank);
		addNoPiece(sixthRank);
		addNoPiece(sixthRank);
		addNoPiece(sixthRank);
	}

	void populateFifthRank(){
		addNoPiece(fifthRank);
		addNoPiece(fifthRank);
		addNoPiece(fifthRank);
		addNoPiece(fifthRank);
		addNoPiece(fifthRank);
		addNoPiece(fifthRank);
		addNoPiece(fifthRank);
		addNoPiece(fifthRank);
	}

	void populateFourthRank(){
		addNoPiece(fourthRank);
		addNoPiece(fourthRank);
		addNoPiece(fourthRank);
		addNoPiece(fourthRank);
		addNoPiece(fourthRank);
		addNoPiece(fourthRank);
		addNoPiece(fourthRank);
		addNoPiece(fourthRank);
	}
	
	void populateThirdRank(){
		addNoPiece(thirdRank);
		addNoPiece(thirdRank);
		addNoPiece(thirdRank);
		addNoPiece(thirdRank);
		addNoPiece(thirdRank);
		addNoPiece(thirdRank);
		addNoPiece(thirdRank);
		addNoPiece(thirdRank);
	}

	void populateSecondRank(){
		addWhitePawn(secondRank);
		addWhitePawn(secondRank);
		addWhitePawn(secondRank);
		addWhitePawn(secondRank);
		addWhitePawn(secondRank);
		addWhitePawn(secondRank);
		addWhitePawn(secondRank);
		addWhitePawn(secondRank);		
	}	
	
	void populateFirstRank(){
		addWhiteRook(firstRank);
		addWhiteKnight(firstRank);
		addWhiteBishop(firstRank);
		addWhiteQueen(firstRank);
		addWhiteKing(firstRank);
		addWhiteBishop(firstRank);
		addWhiteKnight(firstRank);
		addWhiteRook(firstRank);
	}
		
	void addWhitePawn(ArrayList<Piece> rank){
		Piece pawn = Piece.createPiece(WHITE, PAWN);
		pieces.add(pawn);
		rank.add(pawn);
	}
	
	void addWhiteQueen(ArrayList<Piece> rank){
		Piece queen = Piece.createPiece(WHITE, QUEEN);
		pieces.add(queen);
		rank.add(queen);
	}
	
	void addWhiteKing(ArrayList<Piece> rank){
		Piece king = Piece.createPiece(WHITE, KING);
		pieces.add(king);
		rank.add(king);
	}
	
	void addWhiteKnight(ArrayList<Piece> rank){
		Piece knight = Piece.createPiece(WHITE, KNIGHT);
		pieces.add(knight);
		rank.add(knight);
	}
	
	void addWhiteRook(ArrayList<Piece> rank){
		Piece rook = Piece.createPiece(WHITE, ROOK);
		pieces.add(rook);
		rank.add(rook);
	}
	
	void addWhiteBishop(ArrayList<Piece> rank){
		Piece bishop = Piece.createPiece(WHITE, BISHOP);
		pieces.add(bishop);
		rank.add(bishop);
	}	
	
	void addBlackPawn(ArrayList<Piece> rank){
		Piece pawn = Piece.createPiece(BLACK, PAWN);
		pieces.add(pawn);
		rank.add(pawn);
	}
	
	void addBlackQueen(ArrayList<Piece> rank){
		Piece queen = Piece.createPiece(BLACK, QUEEN);
		pieces.add(queen);
		rank.add(queen);
	}
	
	void addBlackKing(ArrayList<Piece> rank){
		Piece king = Piece.createPiece(BLACK, KING);
		pieces.add(king);
		rank.add(king);
	}

	void addBlackKnight(ArrayList<Piece> rank){
		Piece knight = Piece.createPiece(BLACK, KNIGHT);
		pieces.add(knight);
		rank.add(knight);
	}
	
	void addBlackRook(ArrayList<Piece> rank){
		Piece rook = Piece.createPiece(BLACK, ROOK);
		pieces.add(rook);
		rank.add(rook);
	}
	
	void addBlackBishop(ArrayList<Piece> rank){
		Piece bishop = Piece.createPiece(BLACK, BISHOP);
		pieces.add(bishop);
		rank.add(bishop);
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
	
	String getEighthRank(){
		return getRank(eighthRank);
	}

	String getSeventhRank(){
		return getRank(seventhRank);
	}
	
	String getSixthRank(){
		return getRank(sixthRank);
	}
	
	String getFifthRank(){
		return getRank(fifthRank);
	}
	
	String getFourthRank(){
		return getRank(fourthRank);
	}
	
	String getThirdRank(){
		return getRank(thirdRank);
	}

	String getSecondRank(){
		return getRank(secondRank);
	}
	
	String getFirstRank(){
		return getRank(firstRank);
	}
	
	void initialize(){
		createRanks();
		populateFirstRank();
		populateSecondRank();
		populateThirdRank();
		populateFourthRank();
		populateFifthRank();
		populateSixthRank();
		populateSeventhRank();
		populateEighthRank();
	}
	
	void createRanks(){
		board.add(firstRank);
		board.add(secondRank);
		board.add(thirdRank);
		board.add(fourthRank);
		board.add(fifthRank);
		board.add(sixthRank);
		board.add(seventhRank);
		board.add(eighthRank);		
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
	
	public char getPieceAtPosition(String location){
		char file = location.charAt(0);
		int fileInt = getFileInt(file);
		
		String rankString = location.substring(1, 2);
		int rankInt = Integer.parseInt(rankString)-1;
		
		ArrayList<Piece> rank = board.get(rankInt);
		Piece piece = rank.get(fileInt);
		
		return piece.getCharacterRepresentation();
	}
	
	String print(){
		return getEighthRank() + getSeventhRank() + getSixthRank() + 
				getFifthRank() + getFourthRank() + getThirdRank() + 
				getSecondRank() + getFirstRank();
	}
}