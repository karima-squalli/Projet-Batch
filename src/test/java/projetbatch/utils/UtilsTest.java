/**
 * 
 */
package projetbatch.utils;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

/**
 * Utils Test
 * @author karima.squallihoussa
 *
 */
public class UtilsTest {
	/**
	 * Test method for {@link Utils#convertDoubleWithComaToDoubleWithDot(java.lang.String)}.
	 */
	@Test
	public void testConvertDoubleWithComaToDoubleWithDot() {
		Double double1 = Utils.convertDoubleWithComaToDoubleWithDot("2010,11");
		Double double1Compare = 2010.11;
		Assert.assertEquals(double1, double1Compare);
	}
	
	/**
	 * Test method for {@link Utils#convertDoubleWithComaToDoubleWithDot(java.lang.String)}.
	 */
	@Test
	public void testConvertDoubleWithoutComaToDoubleWithDot() {
		Double double1 = Utils.convertDoubleWithComaToDoubleWithDot("2010");
		Double double1Compare = 2010.0;
		Assert.assertEquals(double1, double1Compare);
	}
	
	/**
	 * Test method for {@link Utils#convertDateToString(java.util.Date)}.
	 * @throws ParseException 
	 */
	@Test
	public void testConvertDateToString() {
	    Calendar calendar = Calendar.getInstance();
	    calendar.set(2021, 11, 15);
	    Date date = calendar.getTime();
	    Assert.assertEquals("15/12/2021", Utils.convertDateToString(date));
	  }

	/**
	 * Test method for {@link Utils#convertStringToDate(java.lang.String)}.
	 * @throws ParseException 
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testStringToDate() throws ParseException {
		Date date =new Date(0,0,0,0,0,0);
	    Date dateCompare = Utils.convertStringToDate(Utils.convertDateToString(date));
	    Assert.assertEquals(date, dateCompare);
	}
}
