import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class Test1 {

	@Test
	public void accept() {
		String name="jhon";
		assertEquals("jhon",name);
		System.out.println("Name:"+name);
	}
	@Before
	public void add() {
		String no1="10";
		assertNotNull(no1);
		System.out.println("no1:"+no1);
	}
@After
	public void sub() {
		int a=10,b=5;
		System.out.println("Addition:"+(a+b));
	}
	
@AfterClass
public static void show() {
	System.out.println("This is show method");
}
	}
	

