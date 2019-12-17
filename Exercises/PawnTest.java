public class PawnTest extends junit.framework.TestCase {
	public void testCreate() {
		final String white = "white";
		final String black = "black";
		
		Pawn whitePawn = new Pawn(white);
		assertEquals(white, whitePawn.getColor());
		
		Pawn blackPawn = new Pawn(black);
		assertEquals(black, blackPawn.getColor());
		
	}
}