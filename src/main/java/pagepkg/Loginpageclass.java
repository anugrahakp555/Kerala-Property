package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginpageclass {
	WebDriver driver;
	@FindBy(xpath="/html/body/header/div[2]/div/a[1]/img")
	WebElement logo;
	@FindBy(id ="ulogin")
	WebElement user;
	@FindBy(name ="upass")
	WebElement pass;
	@FindBy(id = "sub_logbtn")
	WebElement button;
	
	public Loginpageclass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement logoverify()
	{
		return logo;
	}
	public void start(String username,String password)
	{
		user.sendKeys(username);
		pass.sendKeys(password);
	}
	public void login()
	{
		button.click();
	}

	

}
