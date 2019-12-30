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
	private ArrayList<Piece> blackFrontRank = new ArrayList<Piece>();
	private ArrayList<Piece> blackRearRank = new ArrayList<Piece>();
	private ArrayList<Piece> whiteFrontRank = new ArrayList<Piece>();
	private ArrayList<Piece> whiteRearRank = new ArrayList<Piece>();
		
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
	
	void addWhitePawn(){
		Piece pawn = Piece.createPiece(WHITE, PAWN);
		pieces.add(pawn);
		whiteFrontRank.add(pawn);
	}

	void addWhiteQueen(){
		Piece queen = Piece.createPiece(WHITE, QUEEN);
		pieces.add(queen);
		whiteRearRank.add(queen);
	}
	
	void addWhiteKing(){
		Piece king = Piece.createPiece(WHITE, KING);
		pieces.add(king);
		whiteRearRank.add(king);
	}
	
	void addWhiteKnight(){
		Piece knight = Piece.createPiece(WHITE, KNIGHT);
		pieces.add(knight);
		whiteRearRank.add(knight);
	}
	
	void addWhiteRook(){
		Piece rook = Piece.createPiece(WHITE, ROOK);
		pieces.add(rook);
		whiteRearRank.add(rook);
	}
	
	void addWhiteBishop(){
		Piece bishop = Piece.createPiece(WHITE, BISHOP);
		pieces.add(bishop);
		whiteRearRank.add(bishop);
	}
	
	void addBlackPawn(){
		Piece pawn = Piece.createPiece(BLACK, PAWN);
		pieces.add(pawn);
		blackFrontRank.add(pawn);
	}
	
	void addBlackQueen(){
		Piece queen = Piece.createPiece(BLACK, QUEEN);
		pieces.add(queen);
		blackRearRank.add(queen);
	}
	
	void addBlackKing(){
		Piece king = Piece.createPiece(BLACK, KING);
		pieces.add(king);
		blackRearRank.add(king);
	}
	
	void addBlackKnight(){
		Piece knight = Piece.createPiece(BLACK, KNIGHT);
		pieces.add(knight);
		blackRearRank.add(knight);
	}
	
	void addBlackRook(){
		Piece rook = Piece.createPiece(BLACK, ROOK);
		pieces.add(rook);
		blackRearRank.add(rook);
	}
	
	void addBlackBishop(){
		Piece bishop = Piece.createPiece(BLACK, BISHOP);
		pieces.add(bishop);
		blackRearRank.add(bishop);
	}
	
	String getBlankRank(){
		return StringUtil.appendNewLine("........");
	}
	
	void addNoPiece(){
		Piece blank = Piece.noPiece();
	}
	
	String getRank(ArrayList<Piece> pieces){
		StringBuilder buffer = new StringBuilder();
		for (Piece piece : pieces){
			buffer.append(piece.getCharacterRepresentation());
		}
		return StringUtil.appendNewLine(buffer.toString());
	}
	
	void createEighthRank(){
		addBlackRook();
		addBlackKnight();
		addBlackBishop();
		addBlackQueen();
		addBlackKing();
		addBlackBishop();
		addBlackKnight();
		addBlackRook();		
	}
	
	String getEighthRank(){
		return getRank(blackRearRank);
	}
	
	void createSeventhRank(){
		addBlackPawn();
		addBlackPawn();
		addBlackPawn();
		addBlackPawn();
		addBlackPawn();
		addBlackPawn();
		addBlackPawn();
		addBlackPawn();		
	}

	String getSeventhRank(){
		return getRank(blackFrontRank);
	}
	
	String getSixthRank(){
		return getBlankRank();
	}
	
	String getFifthRank(){
		return getBlankRank();
	}
	
	String getFourthRank(){
		return getBlankRank();
	}
	
	String getThirdRank(){
		return getBlankRank();
	}
	
	void createSecondRank(){
		addWhitePawn();
		addWhitePawn();
		addWhitePawn();
		addWhitePawn();
		addWhitePawn();
		addWhitePawn();
		addWhitePawn();
		addWhitePawn();		
	}
	
	String getSecondRank(){
		return getRank(whiteFrontRank);
	}
	
	void createFirstRank(){
		addWhiteRook();
		addWhiteKnight();
		addWhiteBishop();
		addWhiteQueen();
		addWhiteKing();
		addWhiteBishop();
		addWhiteKnight();
		addWhiteRook();	
	}
	
	String getFirstRank(){
		return getRank(whiteRearRank);
	}
	
	void initialize(){
		createEighthRank();
		createSeventhRank();

		createSecondRank();
		createFirstRank();
	}
	
	String print(){
		return getEighthRank() + getSeventhRank() + getSixthRank() + 
				getFifthRank() + getFourthRank() + getThirdRank() + 
				getSecondRank() + getFirstRank();
	}
}