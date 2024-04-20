import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;


public class AssertTrueDemo {
@Test
	public void disp() {
		System.out.println("This is disp method");
}

@Test
	public void accept() {
	//if expression is true then test case pass
	
	assertTrue(12>4);
		System.out.println("condition for accept is true");
}

@After
public void accept1() {
//if expression is true then test case pass

	assertTrue(12<4);
	System.out.println("condition for accept is false");
}

@Test
	public void accept2() {
	
	String a="Edubridge";
	assertNotNull(a);
	System.out.println("Value for a:"+a);
}
	
@Test
	public void accept3() {
	
	String b=null;
	assertNull(b);
	System.out.println("Value for b:"+b);
	}

@AfterClass
	//all methods will run 1st then after class test pass
	public void cleanUp() {
	System.out.println("After All cleaUp() method called");
}
}
