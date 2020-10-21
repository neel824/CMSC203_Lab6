import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradebookTester {
GradeBook g1;
GradeBook g2;
	@Before
	public void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(50);
		g1.addScore(75);
		g2.addScore(99);
		g2.addScore(88);
		g2.addScore(92);
		
	}

	@After
	public void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	public void testAddScore() {
		assertTrue(g1.toString().equals("50.0 75.0 "));
		assertTrue(g2.toString().equals("99.0 88.0 92.0 "));
	}

	@Test
	public void testSum() {
		assertEquals(125, g1.sum(), .0001);
		assertEquals(279, g2.sum(), .0001);
	}

	@Test
	public void testMinimum() {
		assertEquals(50, g1.minimum(), .001);
		assertEquals(88, g2.minimum(), .001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(2, g1.getScoreSize(), .001);
		assertEquals(3, g2.getScoreSize(), .001);
	}
}
