package pieces;

import junit.framework.TestCase;

public class PieceTest extends TestCase {
	public void testCreate() {
		final String white = "white";
		final String black = "black";
		final char whitePawnChar = 'p';
		final char blackPawnChar = 'P';
		final char whiteQueenChar = 'q';
		final char blackKingChar = 'K';
		
		Piece whitePawn = new Piece(white, whitePawnChar);
		assertEquals(white, whitePawn.getColor());
		assertEquals(whitePawnChar, whitePawn.getCharacterRepresentation());
		assertTrue(whitePawn.isWhite());
		
		Piece whiteQueen = new Piece(white, whiteQueenChar);
		assertEquals(white, whiteQueen.getColor());
		assertEquals(whiteQueenChar, whiteQueen.getCharacterRepresentation());
		assertTrue(whiteQueen.isWhite());
		
		Piece blackPawn = new Piece(black, blackPawnChar);
		assertEquals(black, blackPawn.getColor());
		assertEquals(blackPawnChar, blackPawn.getCharacterRepresentation());
		assertTrue(blackPawn.isBlack());
		
		Piece blackKing = new Piece(black, blackKingChar);
		assertEquals(black, blackKing.getColor());
		assertEquals(blackKingChar, blackKing.getCharacterRepresentation());
		assertTrue(blackKing.isBlack());
	}
}