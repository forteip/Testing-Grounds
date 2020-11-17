package ca.utoronto.utsc.store;

import ca.utoronto.utsc.store.discounts.ConstantDiscount;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestConstantDiscount{
	@Test
	public void getpricefive() {
		ConstantDiscount testp = new ConstantDiscount(5);
		assertEquals("Product should have a discounted price of 75", 75, testp.getDiscountedPrice(80), 0);
	}
	
	@Test
	public void getpricezero() {
		ConstantDiscount testp = new ConstantDiscount(5);
		assertEquals("Product should have a discounted price of -5", -5, testp.getDiscountedPrice(0), 0);
	}
	
	@Test
	public void getpriceIsZero() {
		ConstantDiscount testp = new ConstantDiscount(5);
		assertEquals("Product should have a discounted price of 0", 0, testp.getDiscountedPrice(5), 0);
	}
}