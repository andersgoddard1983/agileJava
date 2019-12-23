package chess;

import junit.framework.TestCase;
import java.util.*;
import pieces.*;

public class BoardTest extends TestCase {
	public void testCreate(){
		final String blackRank = "PPPPPPPP";
		final String whiteRank = "pppppppp";
		final String emptyRank = "........";
		
		Board board = new Board();
		assertEquals(16, board.getNumberOfPieces());
		assertEquals(emptyRank, board.getEighthRank());
System.out.println(board.getEighthRank());
		assertEquals(blackRank, board.getSeventhRank());
System.out.println(board.getSeventhRank());
		assertEquals(emptyRank, board.getSixthRank());
System.out.println(board.getSixthRank());
		assertEquals(emptyRank, board.getFifthRank());
System.out.println(board.getFifthRank());
		assertEquals(emptyRank, board.getFourthRank());
System.out.println(board.getFourthRank());
		assertEquals(emptyRank, board.getThirdRank());
System.out.println(board.getThirdRank());
		assertEquals(whiteRank, board.getSecondRank());
System.out.println(board.getSecondRank());
		assertEquals(emptyRank, board.getFirstRank());
System.out.println(board.getFirstRank());
	}
}

