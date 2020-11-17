package ca.utoronto.utsc.store;

import ca.utoronto.utsc.store.products.Product;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestProduct{
	@Test
	public void getpricezero() {
		Product testp = new Product("12345", 0);
		assertEquals("Product should have a price of 0", 0, testp.getPrice(), 0);
	}
	
	@Test
	public void getpricenonzero() {
		Product testp = new Product("12345", 5);
		assertTrue("Product should have a price of 5", 0 < testp.getPrice());
	}
	
	public void getpricenegative() {
		Product testp = new Product("12345", -5);
		assertTrue("Product should have a negative price", 0 > testp.getPrice());
	}
}