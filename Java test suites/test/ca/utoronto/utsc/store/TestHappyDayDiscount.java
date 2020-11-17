package ca.utoronto.utsc.store;

import ca.utoronto.utsc.store.discounts.HappyDayDiscount;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Calendar;

public class TestHappyDayDiscount{
	@Test
	public void getpricediscountToday() {
		Calendar today1 = Calendar.getInstance();
		int today = today1.get(Calendar.DAY_OF_WEEK);
		HappyDayDiscount testp = new HappyDayDiscount(0.2, today);
		assertEquals("Product should have a discounted price of 80", 80, testp.getDiscountedPrice(100), 0);
	}
	@Test
	public void getpricediscountnotToday() {
		Calendar today1 = Calendar.getInstance();
		int today = today1.get(Calendar.DAY_OF_WEEK);
		if (today != 7) {
			today = 7;
		}
		if (today == 7) {
			today = 0;
		}
		HappyDayDiscount testp = new HappyDayDiscount(0.2, today);
		assertEquals("Product should have no discounted price, full price 100", 100, testp.getDiscountedPrice(100), 0);
	}
	@Test
	public void getpricediscountTodayEqualZero() {
		Calendar today1 = Calendar.getInstance();
		int today = today1.get(Calendar.DAY_OF_WEEK);
		HappyDayDiscount testp = new HappyDayDiscount(0.2, today);
		assertEquals("Product should have discounted price 0", 0, testp.getDiscountedPrice(0), 0);
	}
	@Test
	public void getpricediscountnotTodayEqualZero() {
		Calendar today1 = Calendar.getInstance();
		int today = today1.get(Calendar.DAY_OF_WEEK);
		if (today != 7) {
			today = 7;
		}
		if (today == 7) {
			today = 0;
		}
		HappyDayDiscount testp = new HappyDayDiscount(0.2, today);
		assertEquals("Product should have no discounted price, full price 0", 0, testp.getDiscountedPrice(0), 0);
	}
}