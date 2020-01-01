package pieces;

import junit.framework.TestCase;
import static util.ConstantUtil.WHITE;
import static util.ConstantUtil.BLACK;
import static util.ConstantUtil.PAWN;
import static util.ConstantUtil.ROOK;
import static util.ConstantUtil.KNIGHT;
import static util.ConstantUtil.BISHOP;
import static util.ConstantUtil.QUEEN;
import static util.ConstantUtil.KING;
import static util.ConstantUtil.PAWN_REPRESENTATION;
import static util.ConstantUtil.ROOK_REPRESENTATION;
import static util.ConstantUtil.KNIGHT_REPRESENTATION;
import static util.ConstantUtil.BISHOP_REPRESENTATION;
import static util.ConstantUtil.QUEEN_REPRESENTATION;
import static util.ConstantUtil.KING_REPRESENTATION;

public class PieceTest extends TestCase {
	
	public void testCreate() {
		
		verifyCreation(
		Piece.createPiece(WHITE, PAWN), 
		Piece.createPiece(BLACK, PAWN),
		Piece.Type.PAWN, 
		PAWN_REPRESENTATION
		);
		
		verifyCreation(
		Piece.createPiece(WHITE, ROOK), 
		Piece.createPiece(BLACK, ROOK),
		Piece.Type.ROOK, 
		ROOK_REPRESENTATION
		);
		
		verifyCreation(
		Piece.createPiece(WHITE, KNIGHT), 
		Piece.createPiece(BLACK, KNIGHT),
		Piece.Type.KNIGHT, 
		KNIGHT_REPRESENTATION
		);
		
		verifyCreation(
		Piece.createPiece(WHITE, BISHOP), 
		Piece.createPiece(BLACK, BISHOP),
		Piece.Type.BISHOP, 
		BISHOP_REPRESENTATION
		);
		
		verifyCreation(
		Piece.createPiece(WHITE, QUEEN), 
		Piece.createPiece(BLACK, QUEEN),
		Piece.Type.QUEEN, 
		QUEEN_REPRESENTATION
		);
		
		verifyCreation(
		Piece.createPiece(WHITE, KING), 
		Piece.createPiece(BLACK, KING),
		Piece.Type.KING, 
		KING_REPRESENTATION
		);
		
		Piece blank = Piece.noPiece();
		assertEquals('.', blank.getCharacterRepresentation());
		assertEquals(Piece.Type.NO_PIECE, blank.getType());
		
		Piece whitePawn = new Piece(WHITE, PAWN_REPRESENTATION);
		assertEquals(WHITE, whitePawn.getColor());
		assertEquals(PAWN_REPRESENTATION, whitePawn.getCharacterRepresentation());
		assertTrue(whitePawn.isWhite());
		
		Piece whiteQueen = new Piece(WHITE, QUEEN_REPRESENTATION);
		assertEquals(WHITE, whiteQueen.getColor());
		assertEquals(QUEEN_REPRESENTATION, whiteQueen.getCharacterRepresentation());
		assertTrue(whiteQueen.isWhite());
		
		Piece blackPawn = new Piece(BLACK, Character.toUpperCase(PAWN_REPRESENTATION));
		assertEquals(BLACK, blackPawn.getColor());
		assertEquals(Character.toUpperCase(PAWN_REPRESENTATION), blackPawn.getCharacterRepresentation());
		assertTrue(blackPawn.isBlack());
		
		Piece blackKing = new Piece(BLACK, Character.toUpperCase(KING_REPRESENTATION));
		assertEquals(BLACK, blackKing.getColor());
		assertEquals(Character.toUpperCase(KING_REPRESENTATION), blackKing.getCharacterRepresentation());
		assertTrue(blackKing.isBlack());
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
}