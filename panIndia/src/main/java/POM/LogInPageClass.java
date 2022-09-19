package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPageClass
	{
		static WebDriver driver;
		      WebDriverWait wait;
		    
		   //declaration
			@FindBy (xpath="//*[@name='username']")
			private WebElement userName;
			
			@FindBy (xpath="//*[@name='password']")
			private WebElement password;
			
			@FindBy (xpath="//button[text()=' Login ']")
			private WebElement LoginButton;
			
			//constructor
			public LogInPageClass(WebDriver driver)
			{
				wait=new WebDriverWait(driver,Duration.ofSeconds(20));
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}
			
			
			//method
			public void senduserName()
			{
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='username']")));
				userName.sendKeys("Admin");
			}
			public void sendpassword()
			{
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='username']")));
				password.sendKeys("admin123");
			}
			public void clickOnLoginButton()
			{
				LoginButton.click();
			}
			
	}

