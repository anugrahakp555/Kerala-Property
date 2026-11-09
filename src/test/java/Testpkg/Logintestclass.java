package Testpkg;

import org.testng.annotations.Test;

import basepkg.baseclass;
import pagepkg.Loginpageclass;
public class Logintestclass extends baseclass {
	@Test
	public void main()
	{
		Loginpageclass ob=new Loginpageclass(driver);
		ob.start("abc@gmail.com","1234");
		ob.login();
		ob.logoverify();
	}
	

}
