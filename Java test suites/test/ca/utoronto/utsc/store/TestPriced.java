package ca.utoronto.utsc.store;

import ca.utoronto.utsc.store.products.Product;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import ca.utoronto.utsc.store.products.MockProduct;

public class TestPriced{
	@Test
	public void getpricezero() {
		MockProduct testp = new MockProduct("12345", 0);
		assertEquals("Product should have a price of 100", 100, testp.getPrice(), 0);
	}
	
}