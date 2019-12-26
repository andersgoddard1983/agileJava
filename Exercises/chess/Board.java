package chess;

import java.util.*;
import pieces.*;
import util.StringUtil;

class Board {

	private ArrayList<Piece> pieces = new ArrayList<Piece>();
	private ArrayList<Piece> blackFrontRank = new ArrayList<Piece>();
	private ArrayList<Piece> blackRearRank = new ArrayList<Piece>();
	private ArrayList<Piece> whiteFrontRank = new ArrayList<Piece>();
	private ArrayList<Piece> whiteRearRank = new ArrayList<Piece>();
	private String blankRank = StringUtil.appendNewLine("........");
	
	Board(){
		initialize();
	}
	
	int pieceCount(){
		return pieces.size();
	}
	
	void addWhitePawn(){
		Piece pawn = new Piece("white", 'p');
		pieces.add(pawn);
		whiteFrontRank.add(pawn);
	}

	void addWhiteQueen(){
		Piece queen = new Piece("white", 'q');
		pieces.add(queen);
		whiteRearRank.add(queen);
	}
	
	void addWhiteKing(){
		Piece king = new Piece("white", 'k');
		pieces.add(king);
		whiteRearRank.add(king);
	}
	
	void addWhiteKnight(){
		Piece knight = new Piece("white", 'n');
		pieces.add(knight);
		whiteRearRank.add(knight);
	}
	
	void addWhiteRook(){
		Piece rook = new Piece("white", 'r');
		pieces.add(rook);
		whiteRearRank.add(rook);
	}
	
	void addWhiteBishop(){
		Piece bishop = new Piece("white", 'b');
		pieces.add(bishop);
		whiteRearRank.add(bishop);
	}
	
	void addBlackPawn(){
		Piece pawn = new Piece("black", 'P');
		pieces.add(pawn);
		blackFrontRank.add(pawn);
	}
	
	void addBlackQueen(){
		Piece queen = new Piece("black", 'Q');
		pieces.add(queen);
		blackRearRank.add(queen);
	}
	
	void addBlackKing(){
		Piece king = new Piece("black", 'K');
		pieces.add(king);
		blackRearRank.add(king);
	}
	
	void addBlackKnight(){
		Piece knight = new Piece("black", 'N');
		pieces.add(knight);
		blackRearRank.add(knight);
	}
	
	void addBlackRook(){
		Piece rook = new Piece("black", 'R');
		pieces.add(rook);
		blackRearRank.add(rook);
	}
	
	void addBlackBishop(){
		Piece bishop = new Piece("black", 'B');
		pieces.add(bishop);
		blackRearRank.add(bishop);
	}
	
	String getRank(ArrayList<Piece> pieces){
		StringBuilder buffer = new StringBuilder();
		for (Piece piece : pieces){
			buffer.append(piece.getCharacterRepresentation());
		}
		return StringUtil.appendNewLine(buffer.toString());
	}
	
	String getEighthRank(){
		return getRank(blackRearRank);
	}

	String getSeventhRank(){
		return getRank(blackFrontRank);
	}
	
	String getSixthRank(){
		return blankRank;
	}
	
	String getFifthRank(){
		return blankRank;
	}
	
	String getFourthRank(){
		return blankRank;
	}
	
	String getThirdRank(){
		return blankRank;
	}
	
	String getSecondRank(){
		return getRank(whiteFrontRank);
	}
	
	String getFirstRank(){
		return getRank(whiteRearRank);
	}
	
	void initialize(){
		addBlackRook();
		addBlackKnight();
		addBlackBishop();
		addBlackQueen();
		addBlackKing();
		addBlackBishop();
		addBlackKnight();
		addBlackRook();		
		addBlackPawn();
		addBlackPawn();
		addBlackPawn();
		addBlackPawn();
		addBlackPawn();
		addBlackPawn();
		addBlackPawn();
		addBlackPawn();
		addWhitePawn();
		addWhitePawn();
		addWhitePawn();
		addWhitePawn();
		addWhitePawn();
		addWhitePawn();
		addWhitePawn();
		addWhitePawn();
		addWhiteRook();
		addWhiteKnight();
		addWhiteBishop();
		addWhiteQueen();
		addWhiteKing();
		addWhiteBishop();
		addWhiteKnight();
		addWhiteRook();		
	}
	
	String print(){
		return getEighthRank() + getSeventhRank() + getSixthRank() + 
				getFifthRank() + getFourthRank() + getThirdRank() + 
				getSecondRank() + getFirstRank();
	}
}