package ca.utoronto.utsc.store;

import ca.utoronto.utsc.store.calculator.PriceCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import ca.utoronto.utsc.store.discounts.MockDiscount;
import ca.utoronto.utsc.store.products.MockPriced;
import ca.utoronto.utsc.store.products.MockProduct;
import ca.utoronto.utsc.store.products.Priced;

import java.util.List;
import java.util.Arrays;

public class TesterPriceCalculator{
	@Test
	public void returnsright() {
		MockDiscount MD = new MockDiscount();
		PriceCalculator testc = new PriceCalculator(MD);
	    MockPriced P1 = new MockPriced();
	    List<Priced> stuff = Arrays.asList(new MockPriced [] {P1});
		double total = testc.getTotalPrice(stuff);
		assertEquals("Product should have a discounted price of 50", 50, testc.getTotalPrice(stuff), 0);
	}
}