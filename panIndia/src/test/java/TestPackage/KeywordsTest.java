package TestPackage;

import org.testng.Assert;

//package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class KeywordsTest {

			
				@BeforeClass
				public void beforeClass1() 
				{
					System.out.println("beforeclass");
				}
				
				
				@BeforeMethod
				public void beforemethod1() 
				{
					System.out.println("beforemethod");
				}
				
				@Test//(enabled=false)      //if any test case we want to run to stop that time use of enabled=false keyword & which is not in consider in total tests run
				   public void verifyLoginFunctinallity()
			   {
				  System.out.println("testA");
			   }
			
			   @Test(timeOut=2000)          //this timeOut method use for give timeOut period for perticular test case & if test case not run in given time period it will give fail remark to test Case & execute next test case
			   public void verifyHomePage() throws InterruptedException {
				//System.out.println("Hi");
				//Assert.fail();        //assert.fail method throught next line
				System.out.println("testB");
				Assert.fail(); 
				Thread.sleep(3000);
				
			   }
			
			    @Test //(priority=2,invocationCount=2)    //for how much time we have to execute test cases for  
			    public void TestC() {                  //that we have we have to use invocationCount keyword 
				System.out.println("testC");
			   }
			
				
				@Test(dependsOnMethods={"TestC"})
				public void TestA()                  //Test A Home Page unctinality
			    {
				System.out.println("testA");	
			    }
				
				@Test(priority=-1)
				public void TestB()
			    {
				System.out.println("testB");	
			    }
				
				@Test()
				
				@AfterClass
				public void afterclass1()
				{
					System.out.println("Afterclass");
				}
				@AfterMethod
				public void Aftermethod1()
				{
					System.out.println("Aftermethod");	
				}
        

	}


