package ca.utoronto.utsc.store;

import ca.utoronto.utsc.store.calculator.PriceCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import ca.utoronto.utsc.store.discounts.MockDiscount;
import ca.utoronto.utsc.store.products.MockPriced;
import java.util.List;
import java.util.Arrays;

public class TestPriceCalculator{
	@Test
	public void returnsright() {
		MockDiscount MD = new MockDiscount();
		PriceCalculator testc = new PriceCalculator(MD);
	    MockPriced P1 = new MockPriced();
	    MockPriced P2 = new MockPriced();
	    List<MockPriced> stuff = Arrays.asList(new MockPriced [] {P1, P2});
		double total = testc.getTotalPrice(stuff)
		assertEquals("Product should have a discounted price of 75", 75, testc.getDiscountedPrice(80), 0);
	}
}