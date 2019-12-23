package pieces;

import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() {
		final String white = "white";
		final String black = "black";
		final char whiteCharacterRepresentation = 'p';
		final char blackCharacterRepresentation = 'P';
		
		Pawn whitePawn = new Pawn(white, whiteCharacterRepresentation);
		assertEquals(white, whitePawn.getColor());
		assertEquals(whiteCharacterRepresentation, whitePawn.getCharacterRepresentation());
		
		Pawn blackPawn = new Pawn(black, blackCharacterRepresentation);
		assertEquals(black, blackPawn.getColor());
		assertEquals(blackCharacterRepresentation, blackPawn.getCharacterRepresentation());
		
		Pawn defaultPawn = new Pawn();
		assertEquals(white, defaultPawn.getColor());
		assertEquals(whiteCharacterRepresentation, whitePawn.getCharacterRepresentation());
	}
}