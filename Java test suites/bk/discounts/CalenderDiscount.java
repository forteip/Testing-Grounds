package ca.utoronto.utsc.store.discounts;

public abstract class CalenderDiscount implements Discount{
	private double discountRate;
	public CalenderDiscount(double rate) {
		this.discountRate = rate;
	}
	public double getDiscountedPrice(double price) {
		if (isApplicableToday()) {
			return (1-discountRate)*price;
		}
		else {
			return price;
		}
	}
	public abstract boolean isApplicableToday();
}