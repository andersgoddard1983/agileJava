package chess;

import junit.framework.TestCase;
import util.StringUtil;
import pieces.*;

public class BoardTest extends TestCase {
		private Board board;
		private Board board2;
		
		protected void setUp(){
		board = new Board();
		}
		
		public void testCreate(){
		assertEquals(32, board.pieceCount());
		assertEquals(8, board.pieceCount("White", 'p'));
		assertEquals(1, board.pieceCount("Black", 'K'));
		assertEquals(2, board.pieceCount("White", 'r'));
		
		String blankRank = StringUtil.appendNewLine("........");
		System.out.println(board.pieceCount());
		assertEquals(
			StringUtil.appendNewLine("RNBQKBNR") +
			StringUtil.appendNewLine("PPPPPPPP") + 
			blankRank + blankRank + blankRank + blankRank + 
			StringUtil.appendNewLine("pppppppp") + 
			StringUtil.appendNewLine("rnbqkbnr"), 
			board.print());
	}
}

