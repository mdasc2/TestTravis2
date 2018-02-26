package test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import logic.LogicCalculator;




public class TestGUICalculator {

	@Test
	public void MyTestSum(){
		LogicCalculator test = new LogicCalculator();
		test.sum(10,10);
		assertEquals(20,  test.result, 0);
	}
	
	@Test
	public void MyTestSub()
	{
		LogicCalculator test = new LogicCalculator();
		test.sub(10, 5);
		assertEquals(5, test.result,0);
	}
	@Test
	public void myTestDiv()
	{
		LogicCalculator test = new LogicCalculator();
		test.div(10, 3);
		assertEquals(3.33, test.result ,0.01);
	}
	
	@Test
	public void myTestMulti()
	{
		LogicCalculator test = new LogicCalculator();
		test.mul(10, 3);
		assertEquals(30, test.result ,0);
	}
		
}
