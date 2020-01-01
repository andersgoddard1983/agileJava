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
		/* Taken out, as initialising board set to empty
		assertEquals(32, board.pieceCount());
		assertEquals(8, board.pieceCount("White", 'p'));
		assertEquals(1, board.pieceCount("Black", 'K'));
		assertEquals(2, board.pieceCount("White", 'r'));
		assertEquals('k', board.getPieceAtPosition("e1"));
		assertEquals('Q', board.getPieceAtPosition("d8"));
		assertEquals('r', board.getPieceAtPosition("h1"));
		assertEquals('.', board.getPieceAtPosition("d4"));
		
		String blankRank = StringUtil.appendNewLine("........");
		assertEquals(
			StringUtil.appendNewLine("RNBQKBNR") +
			StringUtil.appendNewLine("PPPPPPPP") + 
			blankRank + blankRank + blankRank + blankRank + 
			StringUtil.appendNewLine("pppppppp") + 
			StringUtil.appendNewLine("rnbqkbnr"), 
			board.print());
		*/
		
		assertEquals(0, board.pieceCount());
		assertEquals(0, board.pieceCount("White", 'p'));
		assertEquals(0, board.pieceCount("Black", 'K'));
		assertEquals(0, board.pieceCount("White", 'r'));
		assertEquals('.', board.getPieceAtPosition("e1"));
		assertEquals('.', board.getPieceAtPosition("d8"));	
		
		String blankRank = StringUtil.appendNewLine("........");
		assertEquals(blankRank + blankRank + blankRank + blankRank + 
					blankRank + blankRank + blankRank + blankRank, 
					board.print());
					
		board.setPieceAtPosition("e1", new Piece("White", 'r'));
		board.setPieceAtPosition("f1", new Piece("White", 'k'));
		board.setPieceAtPosition("f2", new Piece("White", 'p'));
		board.setPieceAtPosition("f3", new Piece("White", 'p'));
		board.setPieceAtPosition("f4", new Piece("White", 'n'));
		board.setPieceAtPosition("g2", new Piece("White", 'p'));
		board.setPieceAtPosition("g4", new Piece("White", 'q'));
		board.setPieceAtPosition("h3", new Piece("White", 'p'));
		assertEquals('q', board.getPieceAtPosition("g4"));
		
		board.setPieceAtPosition("a7", new Piece("Black", 'P'));
		board.setPieceAtPosition("b6", new Piece("Black", 'P'));
		board.setPieceAtPosition("b8", new Piece("Black", 'K'));
		board.setPieceAtPosition("c7", new Piece("Black", 'P'));
		board.setPieceAtPosition("c8", new Piece("Black", 'R'));
		board.setPieceAtPosition("d7", new Piece("Black", 'B'));
		board.setPieceAtPosition("e6", new Piece("Black", 'Q'));
		board.setPieceStrength("White");
		board.setPieceStrength("Black");
		
		assertEquals(19.5, board.getStrength("White"));
		assertEquals(20.0, board.getStrength("Black"));
	}
}

