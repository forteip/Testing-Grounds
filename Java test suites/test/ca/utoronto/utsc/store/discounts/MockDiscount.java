package ca.utoronto.utsc.store.discounts;

import ca.utoronto.utsc.store.discounts.Discount;

public class MockDiscount implements Discount{
	@Override
	public double getDiscountedPrice(double price) {
		return 50;
	}
}