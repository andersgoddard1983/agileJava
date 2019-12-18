package chess;

import junit.framework.TestCase;
import java.util.*;
import pieces.*;

public class BoardTest extends TestCase {
	public void testCreate(){
		Board board = new Board();
		assertEquals(0, board.getNumberOfPieces());
		
		Pawn whitePawn = new Pawn("white");
		board.addPawn(whitePawn);
		assertEquals(1, board.getNumberOfPieces());

		Pawn blackPawn = new Pawn("black");		
		board.addPawn(blackPawn);
		assertEquals(2, board.getNumberOfPieces());
	}
}

