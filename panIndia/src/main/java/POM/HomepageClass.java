package POM;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class HomepageClass 
	{
		
		@FindBy (xpath="//input[@name='email']")
		private WebElement userName;
		
		@FindBy (xpath="//input[@name='pass']")
		private WebElement password;
		
		@FindBy(xpath="//button[@name='login']")
		private WebElement login;
		
		public HomepageClass(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}
		public void sendUserName() {
			userName.sendKeys("admin");
		}
		
		public void sendpassword() {
			password.sendKeys("sonu123");
		}
		public void clickonLoginButton() {
			login.click();
		}
		

	}

