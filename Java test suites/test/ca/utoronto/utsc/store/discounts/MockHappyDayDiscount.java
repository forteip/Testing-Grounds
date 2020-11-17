package ca.utoronto.utsc.store.discounts;

import ca.utoronto.utsc.store.discounts.HappyDayDiscount;

public class MockHappyDayDiscount extends HappyDayDiscount{
	
	public MockHappyDayDiscount() {
		super(25, 2);
	}
	@Override
	public boolean isApplicableToday(){
		return true;
	}
}