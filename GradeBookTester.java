import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	private GradeBook gb1;
	private GradeBook gb2;

	@BeforeEach
	void setUp() throws Exception{
		//create two objects of GradeBook to hold 5 scores.
		gb1 = new GradeBook(5);
		gb2 = new GradeBook(5);
		
		//call the addScore method for each of the GradeBook objects 
		gb1.addScore(50.0);
		gb1.addScore(75.0);
		
		gb2.addScore(35.0);
		gb2.addScore(15.0);
	}

	@AfterEach
	void tearDown() throws Exception{
		//set the two objects of GradeBook to null.
		gb1 = null;
		gb2 = null;
	}

	@Test
	void testAddScore() {
		//use the toString method to compare the contents of what is in the scores 
		//array vs.what is expected to be in the scores array assertTrue
		assertTrue(gb1.toString().equals("50.0 75.0 "));
		assertTrue(gb2.toString().equals("35.0 15.0 "));
		
		//compare the scoreSize to the expected  number of scores entered
		assertEquals(gb1.getScoreSize(), 2);
		assertEquals(gb2.getScoreSize(), 2);
	}

	@Test
	void testSum() {
		//compare what is returned by sum() to the expected sum of the scores entered
		assertEquals(125.0, gb1.sum(), 0.0001);
		assertEquals(50.0, gb2.sum(), 0.0001);
	}

	@Test
	void testMinimum() {
		//compare what is returned by minimum() to the expected minimum of the scores entered
		assertEquals(50.0, gb1.minimum(), 0.001);
		assertEquals(15.0, gb2.minimum(), 0.001);
	}

	@Test
	void testFinalScore() {
		//compare what is returned by finalScore() to the expected finalScore of the 
		//scores entered.
		assertEquals(75.0, gb1.finalScore(), 0.001);
		assertEquals(35.0, gb2.finalScore(), 0.001);
	}

}

