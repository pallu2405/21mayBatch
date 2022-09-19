package TestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {
		
		@BeforeClass
		public void beforeClass() 
		{
			System.out.println("beforeclass");
		}
		
		
		@BeforeMethod
		public void beforemethod() {
			System.out.println("beforemethod");
		}
		@Test
		public void testC() {
			System.out.println("testC");
		}
		@Test
			public void testA()
		{
			System.out.println("testA");
			
		}
		
		@Test
		public void testB() {
			System.out.println("testB");
		}
		
		
		
		@AfterClass
		public void afterclass()
		{
			System.out.println("Afterclass");
		}
		@AfterMethod
		public void Aftermethod()
		{
			System.out.println("Aftermethod");	
		}
		}

