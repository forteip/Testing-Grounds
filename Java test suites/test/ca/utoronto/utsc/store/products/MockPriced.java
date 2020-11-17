package ca.utoronto.utsc.store.products;

import ca.utoronto.utsc.store.products.Priced;

public class MockPriced implements Priced{
	@Override
	public double getPrice() {
		return 100;
	}
	
}