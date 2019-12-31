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
	
	public double getStrength(String color){
		double strength = 0;
		if (color.toUpperCase().equals(WHITE)){
			strength = strength + (pieceCount("White", 'r') * ROOK_STRENGTH);
			strength = strength + (pieceCount("White", 'q') * QUEEN_STRENGTH);
			strength = strength + (pieceCount("White", 'n') * KNIGHT_STRENGTH);
			strength = strength + (pieceCount("White", 'b') * BISHOP_STRENGTH);
			strength = strength + getPawnStrength("White");
		} else if (color.toUpperCase().equals(BLACK)){
			strength = strength + (pieceCount("Black", 'R') * ROOK_STRENGTH);
			strength = strength + (pieceCount("Black", 'Q') * QUEEN_STRENGTH);			
			strength = strength + (pieceCount("Black", 'N') * KNIGHT_STRENGTH);			
			strength = strength + (pieceCount("Black", 'B') * BISHOP_STRENGTH);		
			strength = strength + getPawnStrength("Black");
		}
	return strength;
	}
	
	public double getPawnStrength(String color){
		double pawnStrengthCount = 0.0;
		char characterRepresentation = 'p';
		
		if (color == BLACK)
			Character.toUpperCase(characterRepresentation);
		int pawnCount = pieceCount(color, characterRepresentation);
		
		for (ArrayList<Piece> rank : board){
			boolean pawnInFile = false;
			for (Piece piece : rank){
				if (piece.getCharacterRepresentation() == characterRepresentation){
					if (pawnInFile)
						pawnStrengthCount += PAWN_HALF_STRENGTH;
					else 
						pawnStrengthCount += PAWN_STRENGTH;
						pawnInFile = true;
				}
			}
		}
		
		return pawnStrengthCount;
	}
	
	void initialize(){
		createRanks();
		createFiles();
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
	
	void createFiles(){
		createFile(firstRank);
		createFile(secondRank);
		createFile(thirdRank);
		createFile(fourthRank);
		createFile(fifthRank);
		createFile(sixthRank);
		createFile(seventhRank);
		createFile(eighthRank);
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

/*		
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

	*/

	
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