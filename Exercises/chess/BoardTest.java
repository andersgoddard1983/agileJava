package chess;

import junit.framework.TestCase;
import util.StringUtil;
import pieces.*;

public class BoardTest extends TestCase {
		private Board board;
		
		protected void setUp(){
		board = new Board();
		}
		
		public void testCreate(){
		assertEquals(32, board.pieceCount());
		assertEquals(8, board.pieceCount("White", 'p'));
		assertEquals(1, board.pieceCount("Black", 'K'));
		assertEquals(2, board.pieceCount("White", 'r'));
		assertEquals('k', board.getPieceAtPosition("e1"));
		assertEquals('Q', board.getPieceAtPosition("d8"));
		
		
		String blankRank = StringUtil.appendNewLine("........");
		assertEquals(
			StringUtil.appendNewLine("RNBQKBNR") +
			StringUtil.appendNewLine("PPPPPPPP") + 
			blankRank + blankRank + blankRank + blankRank + 
			StringUtil.appendNewLine("pppppppp") + 
			StringUtil.appendNewLine("rnbqkbnr"), 
			board.print());
	}
}

