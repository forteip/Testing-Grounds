package ca.utoronto.utsc.store;

import ca.utoronto.utsc.store.discounts.SeasonalDiscount;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;

public class TestSeasonalDiscount{
	@Test
	public void getpriceWithinDate() {
	    Calendar calendar = Calendar.getInstance();
	    calendar.set(2015, 10, 15); // Nov 15th 2015
	    Date from = calendar.getTime();
	    calendar.set(2020, 11, 15); // Dec 15th 2020
	    Date to = calendar.getTime();
		SeasonalDiscount testp = new SeasonalDiscount(0.5, from, to);
		assertEquals("Product should have a discounted price of 0.5", 50, testp.getDiscountedPrice(100), 0);
	}
	@Test
	public void getpriceBeforeDateReturnPositive() {
	    Calendar calendar = Calendar.getInstance();
	    calendar.set(2018, 10, 15); // Nov 15th 2015
	    Date from = calendar.getTime();
	    calendar.set(2018, 11, 15); // Dec 15th 2018
	    Date to = calendar.getTime();
		SeasonalDiscount testp = new SeasonalDiscount(0.5, from, to);
		assertEquals("Product should have a discounted price of nothing", 100, testp.getDiscountedPrice(100), 0);
	}
	@Test
	public void getpriceAfterDate() {
	    Calendar calendar = Calendar.getInstance();
	    calendar.set(2012, 10, 15); // Nov 15th 2015
	    Date from = calendar.getTime();
	    calendar.set(2013, 11, 15); // Dec 15th 2018
	    Date to = calendar.getTime();
		SeasonalDiscount testp = new SeasonalDiscount(0.5, from, to);
		assertEquals("Product should have a discounted price of nothing", 100, testp.getDiscountedPrice(100), 0);
	}
	@Test
	public void getpriceBeforeDateReturnZero() {
	    Calendar calendar = Calendar.getInstance();
	    calendar.set(2018, 10, 15); // Nov 15th 2015
	    Date from = calendar.getTime();
	    calendar.set(2018, 11, 15); // Dec 15th 2018
	    Date to = calendar.getTime();
		SeasonalDiscount testp = new SeasonalDiscount(0.5, from, to);
		assertEquals("Product should have a discounted price of nothing", 0, testp.getDiscountedPrice(0), 0);
	}
	@Test
	public void getpriceAfterDateReturnZero() {
	    Calendar calendar = Calendar.getInstance();
	    calendar.set(2012, 10, 15); // Nov 15th 2015
	    Date from = calendar.getTime();
	    calendar.set(2013, 11, 15); // Dec 15th 2018
	    Date to = calendar.getTime();
		SeasonalDiscount testp = new SeasonalDiscount(0.5, from, to);
		assertEquals("Product should have a discounted price of nothing", 0, testp.getDiscountedPrice(0), 0);
	}
	@Test
	public void getpriceInDateReturnZero() {
	    Calendar calendar = Calendar.getInstance();
	    calendar.set(2012, 10, 15); // Nov 15th 2015
	    Date from = calendar.getTime();
	    calendar.set(2013, 11, 15); // Dec 15th 2018
	    Date to = calendar.getTime();
		SeasonalDiscount testp = new SeasonalDiscount(0.5, from, to);
		assertEquals("Product should have a discounted price of nothing", 0, testp.getDiscountedPrice(0), 0);
	}
}