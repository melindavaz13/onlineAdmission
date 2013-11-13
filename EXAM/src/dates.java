import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Date;

public class dates {
	
	static Alerts application;
	static Alerts merrit;
	static Alerts waiting;
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	Date applnDate;
	static Date curr_date = new Date();
	String curr_date1,curr_date2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		application = new Alerts("13/11/2013");
		merrit = new Alerts("22/11/2013");
		waiting =  new Alerts("23/11/2013");
	}

	@Test
	public void testDate() throws ParseException {
		
		//getting the current system date in the correct format
		curr_date1 = formatter.format(curr_date);

		//getting the last date for filling application forms
		applnDate = formatter.parse(application.GetDate());
		curr_date2 = formatter.format(applnDate);
		
		//checking if today is the last date for filling application forms
		assertEquals(curr_date1,application.GetDate());
			System.out.println("today is the last date for filling application forms");
	}

}
