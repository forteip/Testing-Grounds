package ca.utoronto.utsc.store.products;

import ca.utoronto.utsc.store.products.Priced;

public class MockProduct extends Product{
	
	public MockProduct(String isbn, double price) {
		super(isbn, price);
	}
	
	@Override
	public double getPrice() {
		return 100;
	}
}