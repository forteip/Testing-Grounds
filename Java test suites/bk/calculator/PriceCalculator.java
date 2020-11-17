package ca.utoronto.utsc.store.calculator;

import ca.utoronto.utsc.store.products.Priced;
import ca.utoronto.utsc.store.products.Product;
import ca.utoronto.utsc.store.discounts.Discount;
import java.util.Arrays;
import java.util.List;

public class PriceCalculator{
	
	private Discount d;
	
	public PriceCalculator(Discount discount) {
		this.d = discount;
	}
	
	public double getTotalPrice(List<Priced> stuff) {
		double total = 0;
		for (int i = 0; i < stuff.size(); i++) {
			Priced element = stuff.get(i);
			double elementP = element.getPrice();
			total += d.getDiscountedPrice(elementP); 
		}
		return total;
		
	}

}