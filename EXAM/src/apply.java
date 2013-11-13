import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

//to check if a particular student has applied for admission or not
public class apply {

	static Applicant a;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		a = new Applicant("Anna",1140);
	}

	@Test
	public void test() {
		assertEquals("Anna",a.GetName());
		System.out.println(a.GetName() + " has applied for admission");
	}

}
