package ca.utoronto.utsc.store.discounts;

import java.util.Date;

import ca.utoronto.utsc.store.discounts.SeasonalDiscount;

public class MockSeasonalDiscount extends SeasonalDiscount{
	public MockSeasonalDiscount() {
		super(0, new Date(), new Date());
	}
	
	@Override
	public boolean isApplicableToday(){
		return true;
	}
}