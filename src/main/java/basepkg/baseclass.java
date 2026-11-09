package basepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseclass {
	public WebDriver driver;
	public String url="https://keralaproperty.in/";
	@BeforeTest
	public void Start()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("/html/body/header/div[1]/div/a[1]")).click();
	}
	@AfterTest
	public void end()
	{
		driver.quit();
	}

}
