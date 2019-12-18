package chess;

import java.util.*;
import pieces.*;

public class Board {

	ArrayList<Pawn> pawns = new ArrayList<Pawn>();	
	
	Board(){
	}
	
	int getNumberOfPieces(){
		return pawns.size();
	}
	
	void addPawn(Pawn pawn){
		pawns.add(pawn);
	}
}