package pieces;

import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() {
		final String white = "white";
		final String black = "black";
		
		Pawn whitePawn = new Pawn(white);
		assertEquals(white, whitePawn.getColor());
		
		Pawn blackPawn = new Pawn(black);
		assertEquals(black, blackPawn.getColor());
		
		Pawn defaultPawn = new Pawn();
		assertEquals(white, defaultPawn.getColor());
	}
}