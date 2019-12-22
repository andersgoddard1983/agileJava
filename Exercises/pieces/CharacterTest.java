package pieces;

import junit.framework.TestCase;
import java.lang.*;

public class CharacterTest extends TestCase {
	public void testWhitespace(){
		final char newline = '\n';
		final char tab = '\t';
		final char space = ' ';
		
		assertTrue(Character.isWhitespace(space));
		assertTrue(Character.isWhitespace(newline));
		assertTrue(Character.isWhitespace(tab));
	}
}