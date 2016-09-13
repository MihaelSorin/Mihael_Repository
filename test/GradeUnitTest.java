import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import mypack.Grade;

public class GradeUnitTest extends TestCase {

	public GradeUnitTest(String name) {
		super(name);
	}
	
	public void setUp() throws Exception {
	}

	
	public void tearDown() throws Exception {
	}

	
	public void testTypical() {
		assertEquals("wrong grade", 'A', Grade.getLetterByMark(95));
		assertEquals("wrong grade", 'B', Grade.getLetterByMark(72));
		assertEquals("wrong grade", 'C', Grade.getLetterByMark(55));
		assertEquals("wrong grade", 'F', Grade.getLetterByMark(30));
	}
	
	public void testBoundaries() {   
	      assertEquals("wrong grade", 'A', Grade.getLetterByMark(75));
	      assertEquals("wrong grade", 'A', Grade.getLetterByMark(100));
	      assertEquals("wrong grade", 'B', Grade.getLetterByMark(60));
	      assertEquals("wrong grade", 'B', Grade.getLetterByMark(74));
	      assertEquals("wrong grade", 'C', Grade.getLetterByMark(50));
	      assertEquals("wrong grade", 'C', Grade.getLetterByMark(59));
	      assertEquals("wrong grade", 'F', Grade.getLetterByMark(0));
	      assertEquals("wrong grade", 'F', Grade.getLetterByMark(49));
	   }

}
