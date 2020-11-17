package ca.utoronto.utsc.store.discounts;
import ca.utoronto.utsc.store.discounts.CalendarDiscount;
import java.util.Calendar;

public class HappyDayDiscount extends CalendarDiscount {
	private int happyday;
	
	public HappyDayDiscount(double rate, int day) {
		super(rate);
		this.happyday = day;
		
	}

	public boolean isApplicableToday() {
		Calendar today = Calendar.getInstance();
		int day = today.get(Calendar.DAY_OF_WEEK);
		if (this.happyday == day) {
			return true;
		}
		else {
			return false;
		}
	}
}