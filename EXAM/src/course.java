import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.Test;


public class course {

	static Subject one;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//creating a subject
		one = new Subject("OOAD",100);
	}

	@Test
	public void testSubject() {
		//checking if the subject exists
		assertEquals("OOAD",one.GetSubjectName());
		System.out.println(one.GetSubjectName() + " Subject is offered in Goa university");
	}
	
	@Test
	public void testMarks() {
		//checking if the subject is out of 100 marks
		assertTrue(100==one.GetSubjectMarks());
		System.out.println(one.GetSubjectName() + " is out of " + one.GetSubjectMarks());
	}

}
