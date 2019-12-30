package pieces;

import junit.framework.TestCase;

public class PieceTest extends TestCase {
	
	final static String WHITE = "WHITE";
	final static String BLACK = "BLACK";
	final static String PAWN = "PAWN";
	final static String ROOK = "ROOK";
	final static String KNIGHT = "KNIGHT";
	final static String BISHOP = "BISHOP";
	final static String QUEEN = "QUEEN";
	final static String KING = "KING";	
	
	public void testCreate() {
		
		verifyCreation(
		Piece.createPiece(WHITE, PAWN), 
		Piece.createPiece(BLACK, PAWN),
		Piece.Type.PAWN, 
		Piece.PAWN_REPRESENTATION
		);
		
		verifyCreation(
		Piece.createPiece(WHITE, ROOK), 
		Piece.createPiece(BLACK, ROOK),
		Piece.Type.ROOK, 
		Piece.ROOK_REPRESENTATION
		);
		
		verifyCreation(
		Piece.createPiece(WHITE, KNIGHT), 
		Piece.createPiece(BLACK, KNIGHT),
		Piece.Type.KNIGHT, 
		Piece.KNIGHT_REPRESENTATION
		);
		
		verifyCreation(
		Piece.createPiece(WHITE, BISHOP), 
		Piece.createPiece(BLACK, BISHOP),
		Piece.Type.BISHOP, 
		Piece.BISHOP_REPRESENTATION
		);
		
		verifyCreation(
		Piece.createPiece(WHITE, QUEEN), 
		Piece.createPiece(BLACK, QUEEN),
		Piece.Type.QUEEN, 
		Piece.QUEEN_REPRESENTATION
		);
		
		verifyCreation(
		Piece.createPiece(WHITE, KING), 
		Piece.createPiece(BLACK, KING),
		Piece.Type.KING, 
		Piece.KING_REPRESENTATION
		);
		
		Piece blank = Piece.noPiece();
		assertEquals('.', blank.getCharacterRepresentation());
		assertEquals(Piece.Type.NO_PIECE, blank.getType());
	}
		
	private void verifyCreation(
		Piece whitePiece, 
		Piece blackPiece, 
		Piece.Type type, 
		char characterRepresentation){
		assertTrue(whitePiece.isWhite());
		assertEquals(type, whitePiece.getType());
		assertEquals(characterRepresentation, whitePiece.getCharacterRepresentation());
			
		assertTrue(blackPiece.isBlack());
		assertEquals(type, blackPiece.getType());
		assertEquals(Character.toUpperCase(characterRepresentation), blackPiece.getCharacterRepresentation());
	}
		
		/*
		final String white = "White";
		final String black = "Black";
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
		*/
}