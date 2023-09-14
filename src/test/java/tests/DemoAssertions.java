package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssertions {
	
	//@Test
//	public void demoHard()
//	{
//		
//		
//		String s1="Chrompet";
//		
//		String s2="Velachery";
//		
//		
//		//Assert.assertEquals(s1, s2,"Both the Strings are not equals");
//		
//		Assert.assertNotEquals(s1, s2);
//			
//		
//	}
	
	@Test
	public void demoSoft()
	{
		
		String a="Testing";
		String b="Developing";
		
		SoftAssert s = new SoftAssert();
		
		s.assertEquals(a, b,"Both the strings are not equals");//
		System.out.println("strings are not equals");
		s.assertAll();
	}
}
