package ca.utoronto.utsc.store.discounts;

import ca.utoronto.utsc.store.discounts.CalendarDiscount;
import java.util.Date;

public class SeasonalDiscount extends CalendarDiscount {
	private java.util.Date from;
	private java.util.Date to;
	public SeasonalDiscount(double rate, java.util.Date from, java.util.Date to) {
		super(rate);
		this.from = from;
		this.to = to;
	}
	
	public boolean isApplicableToday() {
		Date today = new Date();
		if (today.after(from) & today.before(to)) {
			return true;
		}
		else {
			return false;
		}
	}
}