package pieces;

import junit.framework.TestCase;

public class PieceTest extends TestCase {
	public void testCreate() {
		
		verifyCreation(
		Piece.createWhitePawn(), 
		Piece.createBlackPawn(),
		Piece.Type.PAWN, 
		Piece.PAWN_REPRESENTATION
		);
		
		verifyCreation(
		Piece.createWhiteRook(), 
		Piece.createBlackRook(),
		Piece.Type.ROOK, 
		Piece.ROOK_REPRESENTATION
		);
		
		verifyCreation(
		Piece.createWhiteKnight(), 
		Piece.createBlackKnight(),
		Piece.Type.KNIGHT, 
		Piece.KNIGHT_REPRESENTATION
		);
		
		verifyCreation(
		Piece.createWhiteBishop(), 
		Piece.createBlackBishop(),
		Piece.Type.BISHOP, 
		Piece.BISHOP_REPRESENTATION
		);
		
		verifyCreation(
		Piece.createWhiteQueen(), 
		Piece.createBlackQueen(),
		Piece.Type.QUEEN, 
		Piece.QUEEN_REPRESENTATION
		);
		
		verifyCreation(
		Piece.createWhiteKing(), 
		Piece.createBlackKing(),
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