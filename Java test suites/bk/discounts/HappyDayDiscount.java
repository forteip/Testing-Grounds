package ca.utoronto.utsc.store.discounts;
import ca.utoronto.utsc.store.discounts.CalenderDiscount;
import java.util.Date;
import java.util.Calendar;

public class HappyDayDiscount extends CalenderDiscount {
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