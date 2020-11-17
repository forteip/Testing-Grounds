package ca.utoronto.utsc.store;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestProduct.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		Result result2 = JUnitCore.runClasses(TestConstantDiscount.class);
		for (Failure failure : result2.getFailures()) {
			System.out.println(failure.toString());
		}
		Result result3 = JUnitCore.runClasses(TestSeasonalDiscount.class);
		for (Failure failure : result3.getFailures()) {
			System.out.println(failure.toString());
		}
		Result result4 = JUnitCore.runClasses(TestHappyDayDiscount.class);
		for (Failure failure : result4.getFailures()) {
			System.out.println(failure.toString());
		}
		Result result5 = JUnitCore.runClasses(TesterPriceCalculator.class);
		for (Failure failure : result5.getFailures()) {
			System.out.println(failure.toString());
		}
		Result result6 = JUnitCore.runClasses(TestPriced.class);
		for (Failure failure : result6.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("All Result Successful for TestProducts =="+result.wasSuccessful());
		System.out.println("All Result Successful for TestConstantDiscount =="+result2.wasSuccessful());
		System.out.println("All Result Successful for TestSeasonalDiscount =="+result3.wasSuccessful());
		System.out.println("All Result Successful for TestHappyDayDiscount =="+result4.wasSuccessful());
		System.out.println("All Result Successful for TesterPriceCalculator =="+result5.wasSuccessful());
		System.out.println("All Result Successful for TesterPriceCalculator =="+result6.wasSuccessful());
	}
}