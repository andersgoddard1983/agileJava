package chess;

import java.util.*;
import pieces.*;

class Board {

	private ArrayList<Pawn> pawns = new ArrayList<Pawn>();
	private ArrayList<Pawn> blackRank = new ArrayList<Pawn>();
	private ArrayList<Pawn> whiteRank = new ArrayList<Pawn>();
	private String blankRank = "........";
	
	Board(){
		initialize();
	}
	
	int getNumberOfPieces(){
		return pawns.size();
	}
	
	void addBlackPawn(){
		Pawn pawn = new Pawn("black", 'P');
		pawns.add(pawn);
		blackRank.add(pawn);
	}
	
	void addWhitePawn(){
		Pawn pawn = new Pawn();
		pawns.add(pawn);
		whiteRank.add(pawn);
	}
	
	String getRank(ArrayList<Pawn> pawns){
		StringBuilder buffer = new StringBuilder();
		for (Pawn pawn : pawns){
			buffer.append(pawn.getCharacterRepresentation());
		}
		return buffer.toString();
	}
	
	String getEighthRank(){
		return blankRank;
	}

	String getSeventhRank(){
		return getRank(blackRank);
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
		return getRank(whiteRank);
	}
	
	String getFirstRank(){
		return blankRank;
	}
	

	
	void initialize(){
		addWhitePawn();
		addWhitePawn();
		addWhitePawn();
		addWhitePawn();
		addWhitePawn();
		addWhitePawn();
		addWhitePawn();
		addWhitePawn();
		addBlackPawn();
		addBlackPawn();
		addBlackPawn();
		addBlackPawn();
		addBlackPawn();
		addBlackPawn();
		addBlackPawn();
		addBlackPawn();		
	}
}