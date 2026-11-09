package Testpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.baseclass;
import pagepkg.Loginpageclass;
import pagepkg.Registerpage;



public class Registertest extends baseclass {
	@Test(priority = 1)
	public void logoverification()
	{
		Loginpageclass object=new Loginpageclass(driver);
		WebElement i=object.logoverify();
		if(i.isDisplayed())
		{
			System.out.println("logo verified");
		}
		else
		{
			System.out.println("logo not verified");
		}
	}
	@Test(priority = 2)
	public void Main() throws InterruptedException
	{
		Loginpageclass ob=new Loginpageclass(driver);
		ob.start("abc@gmail.com","abc");
		ob.login();
		Registerpage ob1=new Registerpage (driver);
		ob1.registerpage("Anugraha","anugrahakp555@gamil.com","Anugraha@","Anugraha@","9874561230");
		ob1.dropdown("agent");
		String expected="Kerala Real Estate Website | Kerala Property";
		String actual=driver.getTitle();
		if(expected.equals(actual))
		{
			System.out.println("title verified");
		}
		else
		{
			System.out.println("title incorrect");
		}
		Assert.assertEquals(actual, expected,"Title verification Failed");
		System.out.println("Title verification passed");
		ob1.register();
		Thread.sleep(3000);
		Alert b=driver.switchTo().alert();
		Thread.sleep(3000);
		b.accept();
	}
}
