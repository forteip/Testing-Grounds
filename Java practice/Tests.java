import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MyTests {
	
	@Test
	public void lightswitch(){
		classic_light tester = new classic_light();
		
		assertEquals(0, tester.state, "testing if off");
		
	}
	
}