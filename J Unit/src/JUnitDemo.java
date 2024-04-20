import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

public class JUnitDemo {
@Test
	public void show() {
	String name="Sakshi";
	/*assertEquals(assumed value, actual value)
	 * If assume value and actual value both are equal then test case is true other wise false
	 */
	assertEquals("Sakshi",name);
}

@Before
	//@Before method execute before test method
	public void add() {
	int i=10, j=30;
	System.out.println("Addition: "+(i+j));
}

@After
	//@After method will execute after test method
	public void sub() {
	int i=10, j=30;
	System.out.println("Substraction: "+(i-j));
}
	
@Ignore
	//@Ignore Sometimes 
	public void mul() {
	int i=10, j=30;
	System.out.println("Multification: "+(i*j));
}


}
