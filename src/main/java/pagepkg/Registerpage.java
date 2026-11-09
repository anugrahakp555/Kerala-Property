package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registerpage {
WebDriver driver;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div[2]/div[2]/a")
	WebElement newuser;
	@FindBy(name="listowner")
	WebElement owner;
	@FindBy(name="utitle")
	WebElement name;
	@FindBy(name="umail")
	WebElement email;
	@FindBy(name="memberpass")
	WebElement password;
	@FindBy(name="repass")
	WebElement repass;
	@FindBy(name="umobile")
	WebElement phone;
	@FindBy(name="sub_regbutton")
	WebElement button;
	
	public Registerpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void dropdown(String listowner)
	{
		WebElement dp=owner;
		Select a=new Select(dp);
		a.selectByValue(listowner);
	}
	
	public void registerpage(String names,String mail,String pass,String Repass,String phoneno)
	{
		newuser.click();
		name.sendKeys(names);
		email.sendKeys(mail);
		password.sendKeys(pass);
		repass.sendKeys(Repass);
		phone.sendKeys(phoneno);
	}
	public void titleverification()
	{
		
	}
	public void register()
	{
		button.click();
	}
	
}
