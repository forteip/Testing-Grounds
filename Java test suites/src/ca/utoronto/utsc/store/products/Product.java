package ca.utoronto.utsc.store.products;

import ca.utoronto.utsc.store.products.Priced;

public class Product implements Priced{
	
	private double price;
	private String isbn;
	
	public Product(String isbn, double price){
		this.isbn = isbn;
		this.price = price;
	}
	public double getPrice() {
		return this.price;
	}
}